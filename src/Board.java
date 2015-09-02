/**
 * Created by Goat Party on 9/2/2015.
 */
public class Board {
    private String topPropertyType[], topPropNames[];
    private double topPrice[];

    /**
     * Prints out the board initially
     */
    public void topBoard() {
        for (int x = 1; x <= 8; x++) {
            if (x == 1) {
                for (int topRow = 0; topRow < 140; topRow++) {
                    System.out.print("*");
                }
                System.out.println();
            } else if (x == 2) {
                for (int numFields = 0; numFields < 10; numFields++) {
                    System.out.printf("*%12S*", topPropNames[numFields]);
                }
                System.out.println();

            } else if (x == 3) {
                for (int y = 0; y < 10; y++) {
                    System.out.print("*            *");
                }
                System.out.println();
            } else if (x == 4) {
                for (int numFields = 0; numFields < 10; numFields++) {
                    System.out.printf("*%12S*", topPrice[numFields]);
                }
                System.out.println();
            } else if (x == 5) {
                for (int y = 0; y < 10; y++) {
                    System.out.print("*            *");
                }
                System.out.println();
            } else if (x == 6) {
                for (int numFields = 0; numFields < 10; numFields++) {
                    System.out.printf("*%12S*", topPropertyType[numFields]);
                }
                System.out.println();
            } else if (x == 7) {
                for (int topRow = 0; topRow < 140; topRow++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
