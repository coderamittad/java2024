package OOps.trial.encapsulation;

public class Bank {
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public double getAccountnumber() {
        return Accountnumber;
    }

    public void setAccountnumber(double accountnumber) {
        Accountnumber = accountnumber;
    }

    private double Accountnumber;
   private String Username;
   private double balance;
   public void deposite(int amount){
       if (amount<=0){
           System.out.println("please amount add");
       }
       else {
           balance=balance+amount;
       }
   }
   public void withdraw(int amount){
       if (amount<=balance&&amount>0){
           balance=balance-amount;
       }
       else {
           System.out.println(" your balance is     "+balance +"   and yoru withdrow amount is="+amount+"chutiyat kadu nako barobar ammount tak");
       }


   }
   public void account(){
       System.out.println(getUsername());
       System.out.println(getAccountnumber());
       if (balance>0){
           System.out.println("total account balance is="+balance);
       }
       else{

       }

   }



}
