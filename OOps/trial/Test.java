package OOps.trial;

public class Test extends Car {
    int spd= (int) (Math.random()*200+1);
    int dec=(int) (Math.random()*50+1);
    public static void main(String[] args) {
        Car c=new Car();
        Test t=new Test();
      c.setCarBrand("black thar");
      c.setModelNumber(1234);
      c.setColor("black and nevy blue");
        c.acceleter(t.spd);
        c.breake(t.dec);
        c.getcar();
    }
}
