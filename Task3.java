import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CONTINUALLY GET PRODUCT TYPE AND QUANTITY FROM USER,
        // AND ADD PRICE TO TOTAL SUM UNTIL USER EXITS WITH PRODUCTNUMBER = 0
        double totalRetailValue = 0;

        while (true) {
            System.out.print("Enter product number (1-5 or 0 to stop): ");
            int productNumber = scanner.nextInt();

            if (productNumber == 0) break;

            double price = switch (productNumber) {
                case 1 -> 2.98;
                case 2 -> 4.50;
                case 3 -> 9.98;
                case 4 -> 4.49;
                case 5 -> 6.87;
                default -> 0;
            };

            System.out.print("Enter quantity sold: ");
            int quantitySold = scanner.nextInt();

            totalRetailValue += quantitySold * price;
        }

        System.out.printf("Total retail value of all products sold is: $%.2f%n", totalRetailValue);
    }
}