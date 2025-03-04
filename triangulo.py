def draw_triangle(size):
    for i in range(1, size + 1):
        print("* " * i)

# Ejemplo de uso
tamano = int(input("Ingrese el tamaño del triángulo: "))
draw_triangle(tamano)