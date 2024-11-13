package OOps.trial.multithreding;

public class th3 extends Thread{
   public th3(String name){
       super(name);

   }
    @Override
    public void run() {
       String a=" ";
        for (int j = 0; j <1000 ; j++) {
            a+="a";

        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"=priority="+currentThread().getPriority()+"=count="+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        th3 t=new th3("amit");
        th3 a=new th3("gangadhar");
        th3 d=new th3("tad");
        t.start();
        a.start();
        d.start();
        t.setPriority(MIN_PRIORITY);
        a.setPriority(MAX_PRIORITY);
        d.setPriority(NORM_PRIORITY);



    }



}
