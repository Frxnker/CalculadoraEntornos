public class Calculadora {

    // Método para sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }
    
    // Método para restar dos números
    public int restar(int a, int b) {
        return a - b;
    }
    
    // Método para multiplicar dos números
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    // Método para dividir dos números
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }

    // Agregar el método potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Agregar el método media
    public static double media(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Ejemplo de operaciones
        System.out.println("Suma: " + calc.sumar(5, 3));
        System.out.println("Resta: " + calc.restar(5, 3));
        System.out.println("Multiplicación: " + calc.multiplicar(5, 3));
        System.out.println("División: " + calc.dividir(5, 3));
    }
}
