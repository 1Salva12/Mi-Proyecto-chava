import numpy as np
from scipy.optimize import minimize
import matplotlib.pyplot as plt

# Número de nodos
n = 4

# Enlaces posibles (pares i < j)
pairs = [(i, j) for i in range(n) for j in range(i+1, n)]
num_links = len(pairs)

# Constantes a_ij (puedes reemplazarlos con tus datos reales)
np.random.seed(0)
a = np.random.uniform(1, 10, num_links)

# Función objetivo (negada porque scipy minimiza)
def objetivo(x):
    return -np.sum(a * np.log(1 + x))

# Restricción de ancho de banda total ≤ 100
def restriccion_total(x):
    return 100 - np.sum(x)

# Cotas: cada x_ij ≥ 0
bounds = [(0, None)] * num_links
restricciones = [{'type': 'ineq', 'fun': restriccion_total}]
x0 = np.ones(num_links)

# Resolver el problema
resultado = minimize(objetivo, x0, method='SLSQP', bounds=bounds, constraints=restricciones)

# Mostrar resultados
if resultado.success:
    asignacion = resultado.x
    rendimiento_total = -resultado.fun
    total_bandwidth = np.sum(asignacion)

    print("Asignación óptima de ancho de banda (x_ij):")
    for idx, (i, j) in enumerate(pairs):
        print(f"x_{i}{j} = {asignacion[idx]:.4f} Mbps (a_ij = {a[idx]:.2f})")
    print(f"\nRendimiento total de la red: {rendimiento_total:.4f}")
    print(f"Uso total de ancho de banda: {total_bandwidth:.4f} Mbps")

    # --------- GRÁFICOS ---------
    etiquetas = [f"{i}-{j}" for i, j in pairs]

    # Barra de asignación
    plt.figure(figsize=(10, 4))
    plt.bar(etiquetas, asignacion, color='skyblue')
    plt.xlabel("Enlaces (i-j)")
    plt.ylabel("Ancho de banda asignado (Mbps)")
    plt.title("Asignación óptima de ancho de banda por enlace")
    plt.grid(True, linestyle="--", alpha=0.5)
    plt.tight_layout()
    plt.show()

    # Pie chart de proporciones
    plt.figure(figsize=(6, 6))
    plt.pie(asignacion, labels=etiquetas, autopct='%1.1f%%', startangle=140)
    plt.title("Distribución porcentual del ancho de banda")
    plt.axis('equal')
    plt.show()

else:
    print("Error en la optimización:", resultado.message)