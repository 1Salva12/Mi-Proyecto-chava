import socket

def server(host='0.0.0.0', port=5001, file_path='C:/Users/Salva/Documents/Telecomunicaciones/teamviewer_manual_es.pdf'):
    file_name = file_path.split('/')[-1]  # Obtener el nombre del archivo

    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server_socket:
        server_socket.bind((host, port))
        server_socket.listen(1)
        print(f"ESPERANDO CONEXIONES EN {host}:{port}")
        
        conn, addr = server_socket.accept()
        with conn:
            print(f"CONEXIÓN ESTABLECIDA DESDE {addr}")
            
            # Enviar el nombre del archivo
            conn.send(file_name.encode('utf-8'))
            
            # Esperar confirmación del cliente
            if conn.recv(1024) == b"FILENAME_RECEIVED":
                # Enviar el contenido del archivo
                with open(file_path, 'rb') as file:
                    while chunk := file.read(1024):
                        conn.send(chunk)
            
            print("ARCHIVO ENVIADO")

if __name__ == "__main__":
    server()