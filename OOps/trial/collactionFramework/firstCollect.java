package OOps.trial.collactionFramework;

import java.util.Scanner;

public class firstCollect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many numbers you enter in array=");
        int i= sc.nextInt();
        int[] arr=new int[i];
        for (int j = 0; j <arr.length ; j++) {
           arr[j]= sc.nextInt();

        }
        for (int k = 0; k <arr.length ; k++) {
            System.out.println("display the enterd number="+  arr[k]);


        }
    }
}
