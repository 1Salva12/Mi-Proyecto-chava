import socket
import threading
import os

BUFFER_SIZE = 1024

def recibir_archivo(conn, direccion):
    try:
        nombre_archivo = conn.recv(BUFFER_SIZE).decode()
        print(f"Recibiendo archivo: {nombre_archivo} de {direccion}")
        with open(nombre_archivo, "wb") as f:
            while True:
                datos = conn.recv(BUFFER_SIZE)
                if not datos:
                    break
                f.write(datos)
        print(f"Archivo {nombre_archivo} recibido exitosamente de {direccion}")
    except Exception as e:
        print(f"Error al recibir archivo de {direccion}: {e}")
    finally:
        conn.close()

def iniciar_servidor():
    host = socket.gethostbyname(socket.gethostname())
    port = 12345

    servidor_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    servidor_socket.bind((host, port))
    servidor_socket.listen(1)  # Escucha hasta 1 conexión entrante
    print(f"Servidor escuchando en {host}:{port}")

    while True:
        conn, direccion = servidor_socket.accept()
        print(f"Conexión entrante de {direccion}")
        threading.Thread(target=recibir_archivo, args=(conn, direccion)).start()

def enviar_archivo(ip_destino):
    puerto_destino = 12345
    nombre_archivo = input("Ingrese el nombre del archivo a enviar: ")

    if not os.path.exists(nombre_archivo):
        print(f"El archivo '{nombre_archivo}' no existe.")
        return

    try:
        cliente_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        cliente_socket.connect((ip_destino, puerto_destino))
        print(f"Conectado a {ip_destino}:{puerto_destino}")

        cliente_socket.send(nombre_archivo.encode())

        with open(nombre_archivo, "rb") as f:
            while True:
                datos = f.read(BUFFER_SIZE)
                if not datos:
                    break
                cliente_socket.send(datos)
        print(f"Archivo '{nombre_archivo}' enviado exitosamente a {ip_destino}")
    except ConnectionRefusedError:
        print(f"Conexión rechazada. Asegúrese de que el receptor esté ejecutando el programa en {ip_destino}.")
    except Exception as e:
        print(f"Error al enviar el archivo: {e}")
    finally:
        if 'cliente_socket' in locals():
            cliente_socket.close()

if __name__ == "__main__":
    while True:
        accion = input("¿Qué desea hacer? (enviar/recibir/salir): ").lower()
        if accion == "enviar":
            ip_destino = input("Ingrese la dirección IP del receptor: ")
            enviar_archivo(ip_destino)
        elif accion == "recibir":
            iniciar_servidor()
            break  # El servidor se queda escuchando, no necesitamos más interacciones
        elif accion == "salir":
            print("Saliendo del programa.")
            break
        else:
            print("Opción no válida. Intente 'enviar', 'recibir' o 'salir'.")