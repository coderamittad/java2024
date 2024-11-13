package thread;

import java.util.Scanner;

public class thraead{
 public  static void game(){
     Runnable r1=()->{
         System.out.println("left side");



     };
     new Thread(r1).start();
 }
 public static void loop(){
     Runnable r2=()->{
         System.out.println("right side");


     };
     new Thread(r2).start();

 }
 public thraead(){
     System.out.println("application start");
     Scanner sc=new Scanner(System.in);

     while (true){
         int choice= sc.nextInt();
         if (choice==0){
             System.out.println("stop");
             break;
         }
         if (choice>4){
             System.out.println("break and stop");
             break;
         }
         else {
            switch (choice){
                case 1:
                    loop();
                    break;
                case 2:
                    game();
                    break;
                case 4:
                    System.out.println("you can repeat");
                    choice=sc.nextInt();
            }


         }



     }

 }

    public static void main(String[] args) {
    new thraead();

    }
}
