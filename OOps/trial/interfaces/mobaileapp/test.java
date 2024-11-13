package OOps.trial.interfaces.mobaileapp;

import java.util.Scanner;

public interface test extends camera,musicplayer,contact{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1for contact 2 for music and 3 for camera");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    contact.conta();
                    break;
                case 2:
                    musicplayer.music();
                    break;
                case 3:
                    camera.oper();
                    break;


            }
            if (choice==0){
                break;
            }


        }
    }

}
