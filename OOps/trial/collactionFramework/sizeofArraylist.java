package OOps.trial.collactionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sizeofArraylist {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            a.add(sc.nextInt());

        }
       Collections.sort(a);
        System.out.println(a);

    }
}
