package arrayas;

import java.util.Arrays;

public class trianglepattern {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");


            }
            for (int j = i; j >0; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
            for (int m = 0; m <=10 ; m++) {
                for (int j = m; j >0; j--) {
                    System.out.print("*");


                }
                for (int j = i; j >0; j--) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
