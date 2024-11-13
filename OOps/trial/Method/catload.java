package OOps.trial.Method;

public class catload {

    public static void act(Cat cat){

         cat.name=cat.name.toUpperCase();

    }

    public static void main(String[] args) {
        Cat a=new Cat();
        a.name="boby";
        act(a);

        System.out.println(a.name);
    }
}
