def es_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def contar_numeros_primos(limite):
    contador = 0
    for num in range(2, limite + 1):
        if es_primo(num):
            contador += 1
    return contador

if __name__ == "__main__":
    limite = 100  # Puedes cambiar este valor
    print(f"Cantidad de números primos hasta {limite}: {contar_numeros_primos(limite)}")
