package OOps.trial.multithreding;

public class pract2 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
            Thread thread=new Thread(new pract2());
            thread.start();
            System.out.println("nit");
            thread.join();
            System.out.println("google");

        }

    @Override
    public void run() {
        System.out.println("naresh it");

    }
}

