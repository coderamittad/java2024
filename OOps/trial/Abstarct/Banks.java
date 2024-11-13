package OOps.trial.Abstarct;

import java.util.Scanner;

public class Banks extends user{
    public void bankdetails(int age, int id, String nama) {

        this.setUserid(id);
        this.setAge(age);
        this.setUsername(nama);
    }

    @Override
    public void histroy() {
        System.out.println(getUsername());
        System.out.println(getUserid());
        System.out.println(getAge());

    }
}










