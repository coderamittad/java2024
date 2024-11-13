package OOps.trial.Enum;

import OOps.trial.multithreding.counter;

public class test {
    public static void main(String[] args) {
        counter counter=new counter();
        counter amit=new counter();
        for (int i = 0; i <20 ; i++) {
            counter.increment();
            amit.increment();


        }
        System.out.println(counter.getCount());
    }
}
