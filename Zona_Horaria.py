from datetime import datetime
import pytz
import time

def obtener_hora_zona_horaria(zona_horaria):
    # Obtiene la hora actual en la zona horaria especificada
    tz = pytz.timezone(zona_horaria)
    hora_actual = datetime.now(tz)
    return hora_actual.strftime("%H:%M:%S")

def sincronizar_hora_zonas_horarias():
    zonas_horarias = ["America/New_York", "Europe/Madrid", "Asia/Tokyo", "Australia/Sydney"]
    while True:
        for zona in zonas_horarias:
            hora = obtener_hora_zona_horaria(zona)
            print(f"Hora en {zona}: {hora}")
        print("-" * 30)  # Separador
        time.sleep(1)

if __name__ == "__main__":
    sincronizar_hora_zonas_horarias()