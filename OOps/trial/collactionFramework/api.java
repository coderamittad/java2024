package OOps.trial.collactionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class api {
    public static List<Integer>method(List<Integer>list){
       Collections.sort(list);
       return list;
    }

    public static void main(String[] args) {
        List<Integer>add=new ArrayList<>();
        add.add(19);
        add.add(13);
        add.add(4);
        add.add(15);
        System.out.println(method(add));



    }
}
