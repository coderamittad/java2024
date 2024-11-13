package OOps.trial.multithreding;

import java.util.Collection;

public class threade3 extends Thread {
    @Override
    public void run() {
        System.out.println("hello amit");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        threade3 t=new threade3();
        System.out.println("jajaj");
        t.start();
        System.out.println(t.getState());
        Thread.sleep(100);
        System.out.println(t.getState());

    }
}
