package arrayas;

public class loops {
    public static void table(int ...nums){
        for (int i:nums) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print("["+i*j+" ]");
                System.out.print("    ");

            }
            System.out.println(  );


        }

    }
    public static void main(String[] args) {
        table(1,2,3,4,5,6,7,8,9,10);

    }
}
