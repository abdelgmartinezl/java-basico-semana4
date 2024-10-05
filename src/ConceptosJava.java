public class ConceptosJava {
    public static void main(String[] args) {
        int entero = 10;
        double doble = entero; // Conversion automatica (implicita)
        System.out.println("Conversion implicita de int a double:");
        System.out.println("Entero: " + entero+ " -> Doble: " + doble);
        System.out.println();

        double numeroDoble = 9.89;
        int numeroEntero = (int) numeroDoble; // Conversion explicita
        System.out.println("Conversion explicita de double a int:");
        System.out.println("Doble: " + numeroDoble + " -> Entero: " + numeroEntero);
        System.out.println();

        int x = 123;
        double y = 456.789;
        String cadena1 = Integer.toString(x); // Conversion a cadena
        String cadena2 = Double.toString(y);
        System.out.println("Conversion de numeros a cadenas: ");
        System.out.println("Entero: " + x + " -> Cadena: \"" + cadena1 + "\"");
        System.out.println("Doble: " + y + " -> Cadena: \"" + cadena2 + "\"");
        System.out.println();

        String cadenaEntero = "789";
        String cadenaDouble = "1064.1213";

        try {
            int convertidoEntero = Integer.parseInt(cadenaEntero);
            double convertidoDouble = Double.parseDouble(cadenaDouble);
            System.out.println("Conversion cadenas: ");
            System.out.println("Cadena: \"" + cadenaEntero + "\" > Entero " + convertidoEntero);
            System.out.println("Cadena: \"" + cadenaDouble + "\" > Doble " + convertidoDouble);
        } catch (NumberFormatException e) {
            System.out.println("Error en la conversion de cadena a números... ");
        }

        int a = 15;
        int b = 4;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = (double) (a / b);
        int modulo = a % b;
        int incremento = a++;
        int decremento = b--;

        System.out.println("\nOperadores Matematicos");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
        System.out.println("Incremento: " + a);
        System.out.println("Decremento: " + b);

    }
}
