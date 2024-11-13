package OOps.trial.inheritance.Humans;

public  class Child extends Parent{
    @Override
    public  void prperty() {

        System.out.println(getAge());
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.setAge(21);
        c.prperty();

    }
}
