package OOps.trial.Recurssion;

public class add {
    public static int adding(int nums){
        if (nums==1){
            return 1;
        }

        return nums+adding(nums-1);
    }

    public static void main(String[] args) {
        System.out.println(adding(4));
    }
}
