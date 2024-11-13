package OOps.trial.multithreding;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    bankaccount bank=new bankaccount();
    Runnable task=new Runnable() {
        @Override
        public void run() {
            System.out.println("Enter withdraw money=");
            Scanner sc=new Scanner(System.in);
            int withdraw= sc.nextInt();
            bank.withdreaw(withdraw);


        }
    };
    Thread t1=new Thread(task,"thread1");
    Thread t2=new Thread(task,"thread2");
    t1.start();
    t2.start();
    }
}
