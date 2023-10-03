public class Calculadora {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // NaN representa "No es un número" en Java
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 10;
        int num2 = 5;

        System.out.println("Suma: " + calculadora.sumar(num1, num2));
        System.out.println("Resta: " + calculadora.restar(num1, num2));
        System.out.println("Multiplicación: " + calculadora.multiplicar(num1, num2));
        System.out.println("División: " + calculadora.dividir(num1, num2));
    }
}
