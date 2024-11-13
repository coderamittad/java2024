package OOps.trial.collactionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class commonelement {
    public static List<Integer>commonelement1(List<Integer>list1,List<Integer>liat2){
        Set<Integer> set = new HashSet<>(list1);
        set.retainAll(liat2);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer>a1=new ArrayList<>();
        List<Integer>a2=new ArrayList<>();
        a1.add(11);
        a1.add(21);
        a1.add(15);
        a2.add(11);
        a2.add(17);
        a2.add(16);
        System.out.println( commonelement1(a1,a2));


    }
}
