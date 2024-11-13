package OOps.trial.AccessModifier.school;

public class Student {
    private  static Student student;
    private Student(){
        System.out.println("helo");

    }
    public static Student getInstance(){
        if (student==null){
            student=new Student();

        }
        return student;
    }
}
