


//Es la clase que tenia antes de optimizarla por si querias verla



/**
 * Clase que representa una calculadora simple.
 * Permite realizar operaciones aritméticas como sumar y restar.
 */
public class CalculadoraSinOptimizar {

    /**
     * Suma dos números enteros.
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La suma de los dos números.
     */
    public int sumar(int a, int b) {
        return a + b; // Realiza la suma de los dos números
    }

    /**
     * Resta dos números enteros.
     * @param a El primer número (minuendo).
     * @param b El segundo número (sustraendo).
     * @return La diferencia entre los dos números.
     */
    public int restar(int a, int b) {
        return a - b; // Realiza la resta de los dos números
    }

    /**
     * Multiplica dos números enteros.
     * @param a El primer número a multiplicar.
     * @param b El segundo número a multiplicar.
     * @return El producto de los dos números.
     */
    public int multiplicar(int a, int b) {
        return a * b; // Realiza la multiplicación de los dos números
    }

    /**
     * Divide dos números enteros.
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de la división.
     * @throws ArithmeticException Si el divisor es 0.
     */
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b; // Realiza la división entre los dos números
    }

    /**
     * Método principal que ejecuta la calculadora.
     * Este método es un ejemplo de cómo usar la clase Calculadora.
     * @param args Argumentos de la línea de comandos (no se usan en este caso).
     */
    public static void main(String[] args) {
        // Crear una instancia de la calculadora
        Calculadora calc = new Calculadora();

        // Realizar algunas operaciones
        int suma = calc.sumar(5, 3);
        int resta = calc.restar(5, 3);
        int multiplicacion = calc.multiplicar(5, 3);
        double division = calc.dividir(5, 3);

        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
