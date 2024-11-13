package OOps.trial.Generics;

import java.util.Arrays;

public class enumtest {

public <t>void printarray(t[] array){
    for (t element:array){
        if (!element.equals(0)){

            System.out.println(element);
        }
    }
    System.out.println();
}
public static void main(String[] args) throws InterruptedException {
    enumtest e=new enumtest();
    Integer arrat[]= new Integer[]{11,12,13,14,5,6,7};
    e.printarray(arrat);

}
}

