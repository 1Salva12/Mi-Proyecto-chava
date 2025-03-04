def draw_square(size):
    for i in range(size):
        print("* " * size)

# Ejemplo de uso
tamano = int(input("Ingrese el tamaño del cuadrado: "))
draw_square(tamano)
