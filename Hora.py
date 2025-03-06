from datetime import datetime
import time

def obtener_hora_actual():
    # Obtiene la hora actual
    ahora = datetime.now()
    # Formatea la hora en un formato legible
    hora_actual = ahora.strftime("%H:%M:%S")
    return hora_actual

def sincronizar_hora():
    while True:
        # Obtiene y muestra la hora actual
        print(f"Hora actual: {obtener_hora_actual()}")
        # Espera 1 segundo antes de actualizar la hora nuevamente
        time.sleep(1)

if __name__ == "__main__":
    sincronizar_hora()