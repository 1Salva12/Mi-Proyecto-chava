import socket
import os
import tkinter as tk
from tkinter import filedialog, messagebox

def send_file(filename, conn):
    """Función para enviar un archivo."""
    try:
        with open(filename, 'rb') as f:
            while chunk := f.read(1024):
                conn.send(chunk)
        print("Archivo enviado exitosamente.")
    except Exception as e:
        print(f"Error al enviar el archivo: {e}")
    finally:
        conn.close()

def receive_file(filename, conn):
    """Función para recibir un archivo."""
    try:
        with open(filename, 'wb') as f:
            while chunk := conn.recv(1024):
                if not chunk:  # Final de transmisión
                    break
                f.write(chunk)
        print(f"Archivo {filename} recibido exitosamente.")
    except Exception as e:
        print(f"Error al recibir el archivo: {e}")
    finally:
        conn.close()

def server():
    """Función para iniciar el servidor que recibe archivos."""
    try:
        server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        server_socket.bind(('0.0.0.0', 5000))
        server_socket.listen(1)
        print("Esperando conexión para recibir archivo...")

        conn, addr = server_socket.accept()
        print(f"Conexión establecida con {addr}")
        
        # Recibir el nombre del archivo
        filename = conn.recv(1024).decode()
        print(f"Recibiendo archivo: {filename}")
        
        # Llamar a la función para recibir el archivo
        receive_file(filename, conn)
    except Exception as e:
        print(f"Error en el servidor: {e}")
    finally:
        server_socket.close()

def client():
    """Función para enviar un archivo al servidor."""
    try:
        # Crear una ventana para seleccionar el archivo a enviar
        root = tk.Tk()
        root.withdraw()  # Ocultar ventana principal

        filename = filedialog.askopenfilename(title="Selecciona el archivo para enviar")
        
        if not filename:
            messagebox.showerror("Error", "No seleccionaste ningún archivo.")
            return

        # Conectar al servidor
        client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        client_socket.settimeout(10)  # Configurar tiempo de espera
        client_socket.connect(('172.168.0.1', 5000))  # Cambiar por la IP del servidor

        # Enviar el nombre del archivo
        client_socket.send(os.path.basename(filename).encode())
        
        # Enviar el archivo
        send_file(filename, client_socket)
    except socket.timeout:
        print("Error: Tiempo de espera agotado. No se pudo conectar con el servidor.")
    except Exception as e:
        print(f"Error en el cliente: {e}")
    finally:
        client_socket.close()

def start_transfer():
    """Función principal para iniciar la transferencia."""
    mode = input("¿Estás enviando o recibiendo un archivo? (escribe 'enviar' o 'recibir'): ").strip().lower()
    
    if mode == "enviar":
        client()
    elif mode == "recibir":
        server()
    else:
        print("Opción inválida. Debes escribir 'enviar' o 'recibir'.")

if __name__ == "__main__":
    start_transfer()
