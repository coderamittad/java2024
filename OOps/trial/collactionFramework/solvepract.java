package OOps.trial.collactionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solvepract {
    public static List<Integer>doublenums(List<Integer>list){
        Set<Integer>set=new HashSet<>();
       List<Integer>adin=new ArrayList<>();
        for (int i:list){
            if (!set.add(i)) {
                adin.add(i);

            }
        }
        return adin;
    }

    public static void main(String[] args) {
        List<Integer>send=new ArrayList<>();send.add(16);
        send.add(16);
        send.add(16);
        send.add(15);
        send.add(18);
        send.add(78);
        System.out.println(send.indexOf(16));
       /* doublenums(send);
        System.out.println(  doublenums(send));*/

    }
}
