package OOps.trial.Generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

 class bounda {

    public static double suma(List<? extends Number> a){
       double sum=0;
       for (Number aa:a){
           sum+=aa.doubleValue();
       }

        return sum;
    }
}
public class boundation {
    public static void main(String[] args) {
       double a= bounda.suma(Arrays.asList(11,22,33));
        System.out.println(a);

    }
}
