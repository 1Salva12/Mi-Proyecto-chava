import re
from collections import Counter

def contar_frecuencia_palabras(texto):
    """
    Cuenta la frecuencia de cada palabra en un texto dado.

    Args:
        texto (str): El texto de entrada.

    Returns:
        collections.Counter: Un objeto Counter donde las claves son las palabras
                             y los valores son sus frecuencias.
    """
    # 1. Convertir el texto a minúsculas para contar las palabras de forma uniforme
    texto = texto.lower()

    # 2. Eliminar signos de puntuación y caracteres especiales, dejando solo palabras
    #    Usamos una expresión regular para encontrar todas las secuencias de letras
    palabras = re.findall(r'\b\w+\b', texto)

    # 3. Utilizar Counter para contar la frecuencia de cada palabra
    frecuencia_palabras = Counter(palabras)

    return frecuencia_palabras

if __name__ == "__main__":
    texto_entrada = input("Ingrese el texto que desea analizar: ")
    frecuencias = contar_frecuencia_palabras(texto_entrada)

    print("\nFrecuencia de cada palabra:")
    for palabra, frecuencia in frecuencias.items():
        print(f"'{palabra}': {frecuencia}")

    # Opcional: Mostrar las palabras más comunes
    num_palabras_comunes = 5  # Puedes cambiar este número
    palabras_mas_comunes = frecuencias.most_common(num_palabras_comunes)
    print(f"\nLas {num_palabras_comunes} palabras más comunes:")
    for palabra, frecuencia in palabras_mas_comunes:
        print(f"'{palabra}': {frecuencia}")