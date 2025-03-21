public class OperacionesUnarias {

    public static void main(String[] args) {
        // Ejemplo de operador de incremento
        int a = 5;
        System.out.println("Valor de a: " + a); // Muestra 5
        a++; // Incremento de 1
        System.out.println("Valor de a después de a++: " + a); // Muestra 6

        // Ejemplo de operador de decremento
        int b = 10;
        System.out.println("Valor de b: " + b); // Muestra 10
        b--; // Decremento de 1
        System.out.println("Valor de b después de b--: " + b); // Muestra 9

        // Ejemplo de operador de negación (booleano)
        boolean flag = true;
        System.out.println("Valor de flag: " + flag); // Muestra true
        flag = !flag; // Negación de valor booleano
        System.out.println("Valor de flag después de !flag: " + flag); // Muestra false

        // Ejemplo de operador unario de signo (positivo/negativo)
        int c = -7;
        System.out.println("Valor de c: " + c); // Muestra -7
        c = +c; // No cambia el signo (es solo para ilustrar)
        System.out.println("Valor de c después de +c: " + c); // Muestra -7 (sin cambio)

        c = -c; // Cambia el signo
        System.out.println("Valor de c después de -c: " + c); // Muestra 7
    }
}
