/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class Task4 {
    public static void main(String[] args) {
        // PRINT LEFT-LEANING TRIANGLE
        for (int row = 0; row < 10; row++) {
            for (int asterisks = 0; asterisks <= row; asterisks++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // PRINT INVERTED LEFT-LEANING TRIANGLE
        System.out.println();
        for (int row = 0; row < 10; row++) {
            for (int asterisks = 10 - row; asterisks > 0; asterisks--) {
                System.out.print('*');
            }
            System.out.println();
        }

        // PRINT INVERTED RIGHT-LEANING TRIANGLE
        System.out.println();
        for (int row = 0; row < 10; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(' ');
            }
            for (int asterisks = 10 - row; asterisks > 0; asterisks--) {
                System.out.print('*');
            }
            System.out.println();
        }

        // PRINT RIGHT-LEANING TRIANGLE
        System.out.println();
        for (int row = 0; row < 10; row++) {
            for (int spaces = 9 - row; spaces > 0; spaces--) {
                System.out.print(' ');
            }
            for (int asterisks = 0; asterisks <= row; asterisks++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}