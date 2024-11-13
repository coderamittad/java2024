package OOps.trial.inheritance.Humans;

public class Parent extends Grandparent{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    @Override
    public void prperty() {
        super.prperty();
        setAge(20);
        System.out.println( getAge());

    }

    public static void main(String[] args) {
        Parent p=new Parent();
        p.prperty();
    }
}
