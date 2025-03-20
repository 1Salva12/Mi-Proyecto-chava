import numpy as np

# Definimos la matriz B y el vector Xb como antes
B = np.array([[0, 0, 0, 1],
              [0, 0, 1, 1],
              [0, 1, 1, 1],
              [1, 1, 1, 1]])
Xb = np.array([1., -2., 3., -1.])

# Utilizamos np.linalg.solve() para resolver Bx = Xb
x = np.linalg.solve(B, Xb)

print("La solución del sistema es:")
print(x)