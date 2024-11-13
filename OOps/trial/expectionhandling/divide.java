package OOps.trial.expectionhandling;

import OOps.trial.encapsulation.Bank;

public class divide {
    public static void main(String[] args) {
     Bank bank=null;
        try {
            bank.account();
        }catch (Exception A){
            System.out.println(A);
            Bank bank1=new Bank();
            bank1.account();
        }
        int[] divide = {100, 24, 5, 78};
        int[] divedend = {2, 4, 0, 10};
        for (int i=0;i<divide.length;i++){
            System.out.println(divident(divide[i],divedend[i]));
        }
    }
    public static int divident(int a,int b){
        try{
            return a/b;
        }catch (Exception e){
           StackTraceElement[] stackTraceElements=e.getStackTrace();
           for (int i=0;i<stackTraceElements.length;i++){
               System.out.println(stackTraceElements[i]);
           }
            return 0;
        }

    }

}
