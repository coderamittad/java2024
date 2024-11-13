package OOps.trial.multithreding;

class Sender {
    public void send(String msg)
    {
        System.out.println("Send\t" + msg);
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println("stop.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

class ThreadedSend extends Thread {
    private String msg;
    Sender sender;
    ThreadedSend(String m, Sender obj)
    {
        msg = m;
        sender = obj;
    }

    public void run()
    {
        synchronized (sender)
        {
            sender.send(msg);
        }
    }
}
class SyncDemo {
    public static void main(String args[])
    {
        Sender send = new Sender();
        ThreadedSend S1 = new ThreadedSend(" Hi ", send);
        ThreadedSend S2 = new ThreadedSend(" Bye ", send);
        ThreadedSend S3= new ThreadedSend(" lawada ", send);
        S1.start();
        S2.start();
        S3.start();
        try {
            S1.join();
            S2.join();
            S3.join();
        }
        catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}

