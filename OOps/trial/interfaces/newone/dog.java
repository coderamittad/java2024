package OOps.trial.interfaces.newone;

public class dog implements Animal,feature{
    @Override
    public void eat() {
        System.out.println("dog eat a huddy");
    }

    @Override
    public void sleep() {
        System.out.println("sleep oltime");

    }

    @Override
    public void color() {
        System.out.println("dog colour is pink,blakc,white");
    }

    @Override
    public void structure() {
        System.out.println("4 legs and 1 tail ");

    }
    public dog(){
        eat();
        sleep();
        color();
        structure();
    }
}
