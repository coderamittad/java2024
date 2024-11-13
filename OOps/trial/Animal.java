package OOps.trial;

public class Animal {
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    private int legs;

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    private int hands;

    public int getEyes() {
        return eyes;
    }

    private final int eyes=2;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
     public void structure(){
         System.out.println("legs="+legs);
         System.out.println("hands="+hands);
         System.out.println("eyes="+eyes);
         System.out.println("colour="+color);
    }
}
