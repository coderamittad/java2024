package OOps.trial.multithreding;

public class thraedae {
    public static void main(String[] args) {
        world world=new world();
        threade2 t=new threade2();
      Thread t1=new Thread(world);
      t1.start();
        t.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());

        }

    }
}
