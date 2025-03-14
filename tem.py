import time

def cronometro():
    inicio = time.time()  # Guarda el tiempo inicial
    try:
        while True:
            tiempo_transcurrido = time.time() - inicio  
            mins, secs = divmod(tiempo_transcurrido, 60)  
            horas, mins = divmod(mins, 60)  
            tiempo_formateado = f"{int(horas):02d}:{int(mins):02d}:{int(secs):02d}"  
            print(tiempo_formateado, end="\r")  
            time.sleep(1)  
    except KeyboardInterrupt:
        print("\nCronómetro detenido.")

# Iniciar el cronómetro
print("Presiona Ctrl + C para detener el cronómetro.")
cronometro()