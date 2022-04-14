package Arrays;

import java.util.Scanner;

public class indexFinder_2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int row = sc.nextInt();
        System.out.println("Enter columns");
        int cols = sc.nextInt();
        int[][] numbers = new int[row][cols];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // KEY INPUT
        System.out.println("Enter your key here");
        int key = sc.nextInt();
        // Iterate
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (key == numbers[i][j]) {
                    System.out.println("(x,y)=(" + i + "," + j + ")" + " ");
                }
            }
        }
        System.out.println();
    }
}
