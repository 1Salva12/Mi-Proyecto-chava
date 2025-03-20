def calcular_resultado(numero):
    # Realizar los cálculos
    resultado = (((numero * 2) * 4) / 2) - 6
    return resultado

try:
    numero = float(input("Ingresa un número: "))
    resultado = calcular_resultado(numero)
    print(f"El resultado es: {resultado}")
except ValueError:
    print("Por favor, ingresa un número válido.")
