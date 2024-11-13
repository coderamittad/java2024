package OOps.trial.multithreding;

public class demona extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("hello");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        demona d=new demona();
        demona d1=new demona();
        d1.start();
        d.setDaemon(true);
        d.start();

        System.out.println("main is complate");
    }
}
