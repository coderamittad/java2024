package OOps.trial.inheritance.Humans;

public class Grandparent {
    public void prperty(){
        int kheti=100;
        int money=100000000;
        System.out.println(kheti);
        System.out.println(money);
    }

    public static void main(String[] args) {
        Grandparent Child=new Child();
        Grandparent parent=new Parent();
        Child.prperty();
        parent.prperty();

    }
}
