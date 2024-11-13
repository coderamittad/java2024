package OOps.trial;

public class Cat{
    Animal a=new Animal();
    void cat(){
        a.setColor("brown");
        a.setLegs(4);
        a.setHands(2);
        a.structure();
        a.structure();

    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.cat();

    }

}
