/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class Task2 {
    public static void main(String[] args) {
        // PRINT COLUMN NAMES
        System.out.printf("%-8s %-8s %-8s", "Side 1", "Side 2", "Hypotenuse");

        // PRINT POSSIBLE PYTHAGOREAN TRIPLETS USING BRUTE FORCE
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = 1; side2 <= 500; side2++) {
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(hypotenuse, 2)) {
                        System.out.printf("%n%-8d %-8d %-8d", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}