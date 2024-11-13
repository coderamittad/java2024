package OOps.trial.inheritance;

import static OOps.trial.Method.SumArray.sumarray;

public class in extends  out {
   public void makesound(){
       System.out.println("sound");


   }
  public  static class cat extends out {
       public void makesound(){
           System.out.println("meow");
       }

   }

    public static void main(String[] args) {
        cat c=new cat();
        c.makesound();
        in i=new in();
        i.makesound();
    }

}
