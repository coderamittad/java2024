package OOps.trial.Method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort {
   public static void sortiaray(int[] sorti){
       Arrays.sort(sorti);
       for (int i = 0; i <sorti.length-1 ; i++) {
           System.out.println(sorti[i]);

       }


}

    public static void main(String[] args) {
        int[] arr ={11,2,44,36,26,98,1,45};
        sortiaray(arr);
    }
}

