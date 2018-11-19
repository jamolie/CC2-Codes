package magicsquare;

import java.io.*;

public class MagicSquare {

    public static void main(String[] args) throws IOException {
        // magic square
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                try {

                    System.out.print("Enter a number: ");
                    int n = Integer.parseInt(br.readLine());
                    int[][] magicSquare = new int[n][n];

                    int number = 1;
                    int row = 0;
                    int column = n / 2;
                    int curr_row;
                    int curr_col;
                    int constant = n * ((n * n + 1) / 2); //constant for the magic square sum of all sides

                    while (number <= n * n) {

                        magicSquare[row][column] = number;
                        number++;
                        curr_row = row;
                        curr_col = column;
                        row -= 1;
                        column += 1;
                        if (row == -1) {
                            row = n - 1;
                        }
                        if (column == n) {
                            column = 0;
                        }
                        if (magicSquare[row][column] != 0) {
                            row = curr_row + 1;
                            column = curr_col;
                            if (row == -1) {
                                row = n - 1;
                            }
                        }
                    }

                    // display the magic square
                    for (int i = 0; i < magicSquare.length; i++) { // display of magic square
                        for (int j = 0; j < magicSquare.length; j++) {

                            System.out.printf("%6s", magicSquare[i][j] + " |");
                        }
                        System.out.println(" : "+constant);
                    }
                    for (int m = 0; m <= magicSquare.length; m++) {
                            System.out.printf("%5s ", constant);
                        }
                    //
                    System.out.println("\n\nSum of each row and column: " + constant); // sum of all magic square thingy

                } catch (ArrayIndexOutOfBoundsException e) { //omg!!! this is for the thingy
                    System.out.println("Enter an odd number.");
                }
            } catch (Exception e) { // for wrong input
                System.out.println("Invalid input!");
            }

            ////////
            System.out.println("\nTry again? y/n");
            String c = br.readLine();
            if (c.equals("y")||c.equals("yes")||c.equals("Yes")||c.equals("Y")||c.equals("YES")) {

            } else if (c.equals("n")||c.equals("no")||c.equals("No")||c.equals("N")||c.equals("NO")) {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        }
    }

}
