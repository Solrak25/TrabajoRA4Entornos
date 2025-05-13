import java.util.Scanner;

//Clase principal que implementa una calculadora básica por consola.

public class Calculadora {
    
    //Método principal que ejecuta la lógica de la calculadora.

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);
        // Variable para controlar si el programa debe continuar o salir
        boolean salir = false;

        // Bucle principal que muestra el menú y realiza las operaciones
        while (!salir) {
            // Mostrar el menú de opciones
            System.out.println("Calculadora por consola");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción elegida por el usuario
            int opcion = scanner.nextInt();

            // Comprobar si la opción es una operación válida
            if (opcion >= 1 && opcion <= 4) {
                // Solicitar el primer número al usuario
                System.out.print("Introduce el primer número: ");
                double num1 = scanner.nextDouble();

                // Solicitar el segundo número al usuario
                System.out.print("Introduce el segundo número: ");
                double num2 = scanner.nextDouble();

                // Realizar la operación correspondiente según la opción elegida
                if (opcion == 1) {
                    // Suma de dos números
                    System.out.println("Resultado de la suma: " + (num1 + num2));
                } else if (opcion == 2) {
                    // Resta de dos números
                    System.out.println("Resultado de la resta: " + (num1 - num2));
                } else if (opcion == 3) {
                    // Multiplicación de dos números
                    System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                } else if (opcion == 4) {
                    // División de dos números, verificando que no sea división por cero
                    if (num2 != 0) {
                        System.out.println("Resultado de la división: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                }
            } else if (opcion == 5) {
                // Si el usuario elige la opción de salir
                salir = true;
                System.out.println("Saliendo de la calculadora...");
            } else {
                // Si la opción ingresada no es válida
                System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
            }

            // Espacio en blanco entre iteraciones del menú
            System.out.println();
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}