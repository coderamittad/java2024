package OOps.trial.encapsulation.Test;

import OOps.trial.encapsulation.Student;

public class testing {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="amit tad";
        s.setAge(10);
        s.setRollnumber(15);
        System.out.println(s.getRollnumber());
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
