import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // GET POPULATION AND GROWTH RATE FROM USER
        System.out.println("Welcome to the world population calculator.");

        System.out.print("Enter the current world population: ");
        long population = scanner.nextLong();

        System.out.print("Enter the current growth rate (e.g, 1.4% = 0.0114): ");
        double growthRate = scanner.nextDouble();

        // PRINT COLUMN NAMES AND VALUES
        System.out.printf("%s %22s %24s", "Year", "Estimated Population", "Change from prior year");

        for (int year = 1; year <= 75; year++) {
            long new_population = (long)(population * (1 + growthRate));

            System.out.printf("%n%4d %22d %24d", year, new_population, new_population - population);

            population = new_population;
        }
    }
}