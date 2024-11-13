package OOps.trial.collactionFramework;

import java.util.ArrayList;
import java.util.List;

public class listofmethod {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(122);
        list.add(1);
        list.add(119);
        list.add(7121);

        List<Integer> list1=List.of();
        for (int i = 0; i <list.size() ; i++) {

           list1=List.of(i);
        }
        System.out.println(list1);

    }
}
