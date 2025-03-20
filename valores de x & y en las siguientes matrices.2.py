import numpy as np
# Define the corrected original matrix with placeholders for x and y
matriz_original = np.array([[x,-2], [7,y]])
matriz_resultante = np.array ([[-4,-2],[7,22]])

# Compare the matrices and resolve for x and y
if np.array_equal(matriz_original, matriz_resultante):
    print("The matrices are equal.")
    # Get the values of x and y
    x = matriz_original[0, 1]  # x is the element in the first row, second column
    y = matriz_original[1, 0]  # y is the element in the second row, first column
    print(f"El valor de x es: {x}")
    print(f"El valor de y es: {y}")
else:
    print("The matrices are not equal. Cannot resolve for x and y.")
    