def suma_matrices(matriz1, matriz2):
    if len(matriz1) != len(matriz2) or len(matriz1[0]) != len(matriz2[0]):
        print("Las matrices no tienen las mismas dimensiones.")
        return None
    filas = len(matriz1)
    columnas = len(matriz1[0])
    resultado = [[0] * columnas for _ in range(filas)]
    for i in range(filas):
        for j in range(columnas):
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
    return resultado
A = [[2, 3, 0], [5, -2, 0], [-11, 12, 0]]
B = [[-1, 7,0], [4, -9,0], [-14, 41,0]]
resultado_suma = suma_matrices(A, B)
if resultado_suma:
    print("La matriz suma de A y B es:")
    for fila in resultado_suma:
        print(fila)
