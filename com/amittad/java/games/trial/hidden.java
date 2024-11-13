package com.amittad.java.games.trial;

 abstract class hidden extends naga {
    int  age(int ...ages){
        for (int i:ages){
            System.out.println("employe ages="+i);
        }

         return 0;
     }
     String name(String ...name){
        for (String i:name){
            System.out.println(i);

        }
        return "hello";
     }

     @Override
     void details() {
         age(12,12,33,44,66);
         name("aditya",",","bamo");
     }

     public static void main(String[] args) {
         hidden h=new hidden() {
             @Override
             int age(int aga) {
                 return 0;
             }

             @Override
             String name(String nama) {
                 return "";
             }
         };

     }
 }

