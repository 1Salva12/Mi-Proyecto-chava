def tablas_multiplicar():
    for i in range(1, 11):
        print(f"Tabla del {i}:")
        for j in range(1, 11):
            print(f"{i} x {j} = {i * j}")
        print("-")  # Separador entre tablas

if __name__ == "__main__":
    tablas_multiplicar()
