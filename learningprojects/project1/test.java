package learningprojects.project1;

import OOps.trial.encapsulation.Bank;

public class test {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setUsername("amit tad");
        b.setAccountnumber(123928263);
        b.deposite(10000);
        b.withdraw(1);
        b.getAccountnumber();
        b.getUsername();
        b.account();

    }
}
