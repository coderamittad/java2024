package learningprojects.project1;

import java.util.Scanner;

public class service extends entity{
    public static void userid(){
        entity a=new entity();
        System.out.println("enter a user id=");
        Scanner sc=new Scanner(System.in);
        int userid= sc.nextInt();
        a.setUserid(userid);
    }
    public static void addreferal(){
        entity a=new entity();
        System.out.println("add refferal=");
        Scanner sc=new Scanner(System.in);
        int reffral= sc.nextInt();
       a. setAddrefferal(reffral);
    }
    public static void withdraw(){
        entity a=new entity();
        System.out.println("enter withdrawl money=");
        Scanner sc=new Scanner(System.in);
        int money= sc.nextInt();
        if (money>a.getUserrefferalincome()&&money>0){
            System.out.println("balance is not match");
        }
        else {
            a.setUserid(money);
        }
    }

}
