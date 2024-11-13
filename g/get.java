package g;

import OOps.trial.Animal;

public class get {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public int age;

    public static void main(String[] args) {
        Animal a=new Animal();
        a.setHands(2);
        a.setLegs(3);
        a.setColor("black");
        a.structure();

        get g=new get();
        for (int i = 0; i <10 ; i++) {
            g.setAge(i*i);
        }

        g.setName("amit gangadhar tad king of coding samrajya");
        System.out.println(g.getName());
       int result= g.getAge();
        System.out.println(result);

    }
}
