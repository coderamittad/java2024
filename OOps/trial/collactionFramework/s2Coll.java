package OOps.trial.collactionFramework;

import java.util.*;

public class s2Coll{
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
      arrayList.add(12);
        arrayList.add(13); arrayList.add(14);
        arrayList.add(45);
     /*   for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i)%2==0) {
                System.out.println(arrayList.get(i));
            }*/
        System.out.println(arrayList.contains(12));
        System.out.println(arrayList.contains(11));
       /* for (int a:arrayList){
            System.out.println(a);

        }*/
    }


}

