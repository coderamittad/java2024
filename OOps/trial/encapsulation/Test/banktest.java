package OOps.trial.encapsulation.Test;

import OOps.trial.encapsulation.Bank;

public class banktest {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setAccountnumber(12345);
        b.setUsername("amit gangadhar tad");
        b.deposite(100);
        b.deposite(6);
        b.withdraw(20);
        b.account();
    }
}
