package OOps.trial;

public class Car {
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    private String carBrand;

    public int getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(int modelNumber) {
        ModelNumber = modelNumber;
    }

    private int ModelNumber;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    private String Color;
    int speed=0;
    public void acceleter(int increment){
       speed+= increment;
    }
    public void breake(int decrement){
        speed-=decrement;
    }
    public void getcar(){
        System.out.println("carbrand="+getCarBrand());
        System.out.println("model number is="+getModelNumber());
        System.out.println("car colour is="+getColor());
        System.out.println( "spped is="+speed);
    }

}
