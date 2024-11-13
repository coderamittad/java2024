package OOps.trial.Generics;

 enum calculation {
     add,sub,multi,divided;
     public <t extends Number>double  result(t a,t b){
         switch (this){
             case add :
                 return a.doubleValue()+b.doubleValue();
             case sub :
                 return a.doubleValue()-b.doubleValue();
             case multi :
                 return a.doubleValue()*b.doubleValue();
             case divided :
                 return a.doubleValue()/b.doubleValue();

         }
         return 0;

     }

}
 public class resarchs {
     public static void main(String[] args) {
        double c= calculation.sub.result(11,22);
         System.out.println(c);

     }

}