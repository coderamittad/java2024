package OOps.trial.multithreding;

import java.util.Arrays;

public class sleeping extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i%2==0) {
                System.out.println("waiting 1000 mils");
                try {
                    Thread.sleep(90);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int[]arr = new int[i];
                System.out.println(Arrays.toString(arr));


            }else {
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        sleeping a=new sleeping();
        a.start();
        a.interrupt();
    }
}
