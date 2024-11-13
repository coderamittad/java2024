package OOps.trial.Generics;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

interface printable{
    void print();
}

 class mynumber extends Number implements printable {

    private final int value;

    public mynumber(int value) {
        this.value = value;
    }


     @Override
     public void print() {
         System.out.println("value is="+value);
     }

     @Override
     public int intValue() {
         return value;
     }

     @Override
     public long longValue() {
         return value;
     }

     @Override
     public float floatValue() {
         return value;
     }

     @Override
     public double doubleValue() {
         return value;
     }
 }
 public class edsaq {
     public static void main(String[] args) {
         mynumber m=new mynumber(12);
         System.out.println(m.doubleValue()+""+m.floatValue()+""+ m.intValue()+"="+ m.intValue());
     }
}
