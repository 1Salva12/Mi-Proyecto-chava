import random
import string

def generar_numero_cuenta(codigo_escuela, codigo_estudiante):
    # Genera 4 dígitos aleatorios
    digitos_aleatorios = ''.join(random.choices(string.digits, k=4))
    # Formato del número de cuenta
    numero_cuenta = f"{codigo_escuela}-{codigo_estudiante}-{digitos_aleatorios}"
    return numero_cuenta

# Solicitar datos al usuario
print("Generador de Número de Cuenta Escolar")
codigo_escuela = input("Ingresa el código de la escuela: ")
codigo_estudiante = input("Ingresa el número del estudiante: ")

# Generar y mostrar el número de cuenta
numero_cuenta = generar_numero_cuenta(codigo_escuela, codigo_estudiante)
print("\nNúmero de cuenta generado:", numero_cuenta)
