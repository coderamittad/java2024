package g;

public class binarystrying {
    public static String binary(int num){
        return Integer.toBinaryString(num);

    }
    public static String hexadecimal(int num){
        return Integer.toOctalString(num);

    }

    public static void main(String[] args) {
        System.out.println(binary(20));
        System.out.println(hexadecimal(20));
    }
}
