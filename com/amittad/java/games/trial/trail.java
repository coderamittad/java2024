package com.amittad.java.games.trial;

public  class trail {
   static String emloyename;
   static float employsalary;
   public static void salary(String name,float salary){
       emloyename=name;
       employsalary=salary;

   }
   public static void addsalary(){
       System.out.println("employeName="+emloyename.toUpperCase()+"  "+"salary="+employsalary);
   }
    public static void main(String[] args) {
      salary("amit",80000);
      addsalary();
      salary("ajay devagan",10000);
      addsalary();
    }
    }
