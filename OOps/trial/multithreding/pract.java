package OOps.trial.multithreding;


class text extends Thread {
    @Override
    public void run() {
        System.out.println("run");
        super.run();
    }

    public synchronized void start() {
        System.out.println("start");
        super.start();
    }
}

    public class pract{
        public static void main(String[] args) {
            nit();
        }
        static public void nit(){
            text t=new text();
            t.start();
        }

    }

