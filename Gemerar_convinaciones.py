import itertools

def generar_combinaciones(caracteres, longitud_minima, longitud_maxima):
    """
    Genera todas las combinaciones posibles de una lista de caracteres
    dentro de un rango de longitudes especificado.

    Args:
        caracteres (str): Una cadena que contiene todos los caracteres posibles
                           para la contraseña.
        longitud_minima (int): La longitud mínima deseada para las contraseñas.
        longitud_maxima (int): La longitud máxima deseada para las contraseñas.

    Returns:
        list: Una lista de todas las combinaciones de contraseñas generadas.
    """
    combinaciones = []
    for longitud in range(longitud_minima, longitud_maxima + 1):
        for combinacion in itertools.product(caracteres, repeat=longitud):
            combinaciones.append("".join(combinacion))
    return combinaciones

if __name__ == "__main__":
    caracteres_posibles = input("Ingrese los caracteres posibles para la contraseña (ej: abc123!@#): ")
    while True:
        try:
            longitud_minima = int(input("Ingrese la longitud mínima de la contraseña: "))
            if longitud_minima <= 0:
                print("La longitud mínima debe ser mayor que cero.")
            else:
                break
        except ValueError:
            print("Por favor, ingrese un número entero para la longitud mínima.")

    while True:
        try:
            longitud_maxima = int(input("Ingrese la longitud máxima de la contraseña: "))
            if longitud_maxima < longitud_minima:
                print("La longitud máxima debe ser mayor o igual que la longitud mínima.")
            elif longitud_maxima <= 0:
                print("La longitud máxima debe ser mayor que cero.")
            else:
                break
        except ValueError:
            print("Por favor, ingrese un número entero para la longitud máxima.")

    print("\nGenerando combinaciones de contraseñas...")
    posibles_contraseñas = generar_combinaciones(caracteres_posibles, longitud_minima, longitud_maxima)
    print(f"Se generaron {len(posibles_contraseñas)} posibles contraseñas.")

    # Opcional: Imprimir las contraseñas generadas (puede ser una lista muy larga)
    # print("\nPosibles contraseñas:")
    # for contraseña in posibles_contraseñas:
    #     print(contraseña)