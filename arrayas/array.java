package arrayas;

import java.util.Scanner;
import OOps.trial.Animal;

public class array {
    public static void main(String[] args) {
        Animal a=new Animal();
        Scanner sc = new Scanner(System.in);
        System.out.println("add");
        int[] am = new int[sc.nextInt()];
        for (int i = 1; i < am.length; i++) {
            am[i] = sc.nextInt();

        }
        int large = am[0];
        for (int j = 1; j < am.length; j++) {
            if (am[j] % 2 == 0) {
                System.out.println(am[j]);
                a.setColor("red");
                a.structure();
            }


        }
    }}
