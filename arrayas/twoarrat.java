package arrayas;

import java.util.Scanner;

public class twoarrat {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a1[][]=new int[sc.nextInt()][sc.nextInt()];
        System.out.println("add 2d array");
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                a1[i][j]=sc.nextInt();

            }

        }
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                System.out.println(a1[i][j]);


            }

        }

}}
