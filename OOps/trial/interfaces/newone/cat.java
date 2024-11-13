package OOps.trial.interfaces.newone;

import OOps.trial.interfaces.mobaileapp.camera;
import OOps.trial.interfaces.mobaileapp.contact;
import OOps.trial.interfaces.mobaileapp.musicplayer;

public class cat implements Animal,feature{

    @Override
    public void eat() {
        System.out.println("fish");
    }

    @Override
    public void sleep() {
        System.out.println(2);
    }

    @Override
    public void color() {
        System.out.println("tambadi");
    }

    @Override
    public void structure() {
        System.out.println("4 legs and one tail height is small");

    }
    public cat(){
        sleep();
        structure();
        eat();


    }
}
