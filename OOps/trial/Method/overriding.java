package OOps.trial.Method;

public class overriding {
    public static int sum(int a,int b){
        return a+b;

    }
    public static int sum(int a,int b,int c){
        int ak=(int) (Math.random()*10+1);
        System.out.println(ak);
        if (ak==1) {
            ak=10;
        }
            return a+b+ak;
    }
    public static void main(String[] args) {
        int sumto=sum(11,12);
       int sumthree= sum(11,2,3);
        System.out.println(sumthree);
        System.out.println(sumto);

    }
}
