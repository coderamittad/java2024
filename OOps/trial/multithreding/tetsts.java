package OOps.trial.multithreding;

public class tetsts {
    public static void main(String[] args) {
    counter counter=new counter();
    tets t=new tets(counter);
    tets a=new tets(counter);
    t.start();
    a.start();
    try {
        t.join();
        a.join();
    }catch (Exception e){
        System.out.println(e);
    }
        System.out.println(counter.getCount());

    }

}
