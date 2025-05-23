/**
 * Clase que representa una calculadora simple.
 * Permite realizar operaciones aritméticas básicas como suma, resta, multiplicación y división.
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     *
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La suma de los dos números.
     */
    public int sumar(int a, int b) {
        return a + b; // Realiza la suma de los dos números
    }

    /**
     * Resta dos números enteros.
     *
     * @param a El primer número (minuendo).
     * @param b El segundo número (sustraendo).
     * @return La diferencia entre los dos números.
     */
    public int restar(int a, int b) {
        return a - b; // Realiza la resta de los dos números
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a El primer número a multiplicar.
     * @param b El segundo número a multiplicar.
     * @return El producto de los dos números.
     */
    public int multiplicar(int a, int b) {
        return a * b; // Realiza la multiplicación de los dos números
    }

    /**
     * Divide dos números enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de la división como un número de punto flotante.
     * @throws ArithmeticException Si el divisor es 0, ya que no es posible realizar una división por cero.
     */
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b; // Realiza la división entre los dos números
    }

    /**
     * Método principal que demuestra el uso de la clase Calculadora.
     * Realiza y muestra el resultado de varias operaciones básicas.
     *
     * @param args Argumentos de la línea de comandos (no se usan en este caso).
     */
    public static void main(String[] args) {
        // Crear una instancia de la calculadora
        Calculadora calc = new Calculadora();

        // Ejemplo de entradas
        int a = 5;
        int b = 3;

        // Realizar y almacenar las operaciones
        int suma = calc.sumar(a, b);
        int resta = calc.restar(a, b);
        int multiplicacion = calc.multiplicar(a, b);
        double division = calc.dividir(a, b);

        // Mostrar los resultados
        System.out.println("Resultados de las operaciones:");
        System.out.println("Suma (" + a + " + " + b + "): " + suma);
        System.out.println("Resta (" + a + " - " + b + "): " + resta);
        System.out.println("Multiplicación (" + a + " * " + b + "): " + multiplicacion);
        System.out.println("División (" + a + " / " + b + "): " + division);
    }
}

