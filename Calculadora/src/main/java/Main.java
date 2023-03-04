public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int suma = calculadora.suma(3, 5);
        int resta = calculadora.resta(5,3);
        double multi = calculadora.multi(3, 5);
        double division = calculadora.division(6, 3);

        System.out.println("Resultado suma: " + suma +
        "\nResultado resta: " + resta +
        "\nResultado multiplicación: " + multi +
        "\nResultado division: " + division);
    }
}
