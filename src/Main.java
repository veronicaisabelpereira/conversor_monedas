import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        while (true) {
            //Menu
            System.out.println("=== Bienvenido/a al Conversor de Monedas ===");
            System.out.println("1) Dólar ==> Peso Argentino");
            System.out.println("2) Peso Argentino ==> Dólar");
            System.out.println("3) Real Brasileño ==> Dólar");
            System.out.println("4) Dólar ==> Real Brasileño");
            System.out.println("5) Dólar ==> Peso Colombiano");
            System.out.println("6) Peso Colombiano ==> Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (option == 1) {
                // Dólar a Peso Argentino
                System.out.print("Ingrese la cantidad en Dólares: ");
                double amount = scanner.nextDouble();
                double convertedAmount = converter.convertCurrency("USD", "ARS", amount);
                System.out.printf("%.2f Dólares son %.2f Pesos Argentinos\n", amount, convertedAmount);
            } else if (option == 2) {
                // Peso Argentino a Dólar
                System.out.print("Ingrese la cantidad en Pesos Argentinos: ");
                double amount = scanner.nextDouble();
                double convertedAmount = converter.convertCurrency("ARS", "USD", amount);
                System.out.printf("%.2f Pesos Argentinos son %.2f Dólares\n", amount, convertedAmount);
            } else if (option == 3) {
                // Real Brasileño a Dólar
                System.out.print("Ingrese la cantidad en Reales Brasileños: ");
                double amount = scanner.nextDouble();
                double convertedAmount = converter.convertCurrency("BRL", "USD", amount);
                System.out.printf("%.2f Reales Brasileños son %.2f Dólares\n", amount, convertedAmount);
            } else if (option == 4) {
                // Dólar a Real Brasileño
                System.out.print("Ingrese la cantidad en Dólares: ");
                double amount = scanner.nextDouble();
                double convertedAmount = converter.convertCurrency("USD", "BRL", amount);
                System.out.printf("%.2f Dólares son %.2f Reales Brasileños\n", amount, convertedAmount);
            } else if (option == 5) {
                // Dólar a Peso Colombiano
                System.out.print("Ingrese la cantidad en Dólares: ");
                double amount = scanner.nextDouble();
                double convertedAmount = converter.convertCurrency("USD", "COP", amount);
                System.out.printf("%.2f Dólares son %.2f Pesos Colombianos\n", amount, convertedAmount);
            } else if (option == 6) {
                // Peso Colombiano a Dólar
                System.out.print("Ingrese la cantidad en Pesos Colombianos: ");
                double amount = scanner.nextDouble();
                double convertedAmount = converter.convertCurrency("COP", "USD", amount);
                System.out.printf("%.2f Pesos Colombianos son %.2f Dólares\n", amount, convertedAmount);
            } else if (option == 7) {
                System.out.println("Saliendo de la aplicación. ¡Adiós!");
                break;
            } else {
                System.out.println("Opción inválida. Por favor, elija nuevamente.");
            }

            System.out.println(); // Línea en blanco para mejor legibilidad
        }

        scanner.close();
    }
}
