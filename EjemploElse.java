public class EjemploElse {

    public static void main(String[] args) {
        int edad = 18;

        // Ejemplo 1: if-else básico
        if (edad >= 18) {
            System.out.println("Eres mayor de edad. Puedes votar.");
        } else {
            System.out.println("Eres menor de edad. No puedes votar aún.");
        }

        int numero = 10;

        // Ejemplo 2: if-else con diferentes tipos de condiciones
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es cero o negativo.");
        }

        boolean esDiaSoleado = false;

        // Ejemplo 3: if-else con variables booleanas
        if (esDiaSoleado) {
            System.out.println("¡Qué buen día para salir!");
        } else {
            System.out.println("Quizás sea mejor quedarse en casa.");
        }

        String nombre = "Juan";

        // Ejemplo 4: if-else con cadenas de texto
        if (nombre.equals("Maria")) {
            System.out.println("Hola, Maria!");
        } else {
            System.out.println("Hola, " + nombre + "!");
        }

        int calificacion = 75;

        // Ejemplo 5: if-else anidado (aunque es mejor usar if-else if-else en estos casos)
        if (calificacion >= 70) {
            System.out.println("Aprobado.");
        } else {
            if (calificacion >= 60) {
                System.out.println("Necesitas mejorar.");
            } else {
                System.out.println("Reprobado.");
            }
        }
    }
}