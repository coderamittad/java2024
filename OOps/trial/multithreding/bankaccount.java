package OOps.trial.multithreding;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class bankaccount {
    private int balance = 700;
    private final Lock lock = new ReentrantLock();

    public void withdreaw(int amount) {
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw money"+" "+amount);
        try {
            if (lock.tryLock(9000, TimeUnit.MILLISECONDS)) {
                if (amount<balance&&amount>0){
                    System.out.println(Thread.currentThread().getName()+" withdraw processing is start : "+balance+"- "+amount);
                   try {
                       Thread.sleep(2000);
                       System.out.println(" withdraw processing is completed.... ");
                        balance-=amount;
                   Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+":-"+" your live balance is : "+balance);
                   }catch (Exception e){
                       Thread.currentThread().interrupt();

                   }finally {
                       lock.unlock();
                   }
                }else {
                    System.out.println(Thread.currentThread().getName()+"amount is not enough");
                }
            }else {
                System.out.println("server is busy");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();

        }
    }
}







