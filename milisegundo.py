from datetime import datetime
import time

def obtener_hora_actual_con_milisegundos():
    # Obtiene la hora actual con milisegundos
    ahora = datetime.now()
    # Formatea la hora en un formato legible con milisegundos
    hora_actual = ahora.strftime("%H:%M:%S.%f")[:-3]  # Elimina los últimos 3 dígitos de los microsegundos
    return hora_actual

def sincronizar_hora_con_milisegundos():
    while True:
        # Obtiene y muestra la hora actual con milisegundos
        print(f"Hora actual: {obtener_hora_actual_con_milisegundos()}")
        # Espera 100 milisegundos antes de actualizar la hora nuevamente
        time.sleep(0.1)

if __name__ == "__main__":
    sincronizar_hora_con_milisegundos()