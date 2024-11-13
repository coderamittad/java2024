package OOps.trial.collactionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class foundElement {
    public static boolean element(List<Integer>li, int num){
        if (li.contains(num)) {
           return true;
        } else {
           return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Integer>ints=new ArrayList<>();
        ints.add(12);
        ints.add(13);
        ints.add(14);
        ints.add(5);
        ints.add(2);
        System.out.println( element(ints,2));




    }
}
