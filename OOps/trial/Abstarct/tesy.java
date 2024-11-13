package OOps.trial.Abstarct;

import java.util.Scanner;

public class tesy {
    public static void main(String[] args) {
     Banks b=new Banks();
        Scanner sc =new Scanner(System.in);
        System.out.println("neter age");
        int age= sc.nextInt();
        System.out.println("enter user id");
        int id=sc.nextInt();
        System.out.println("enter user name=");
        String name= sc.nextLine();
     b.bankdetails(id,age,name);
     b.histroy();



}}
