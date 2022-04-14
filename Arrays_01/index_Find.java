package Arrays_01;

import java.util.Scanner;

public class index_Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key");
        int key = sc.nextInt();
        System.out.println("Enter 5 numbers");
        int[] aray = new int[5];
        for (int i = 0; i < aray.length; i++) {
            aray[i] = sc.nextInt();

        }
        for (int i = 0; i < aray.length; i++) {
            if (key == aray[i]) {
                System.out.println(i);
            }

        }

    }

}
