package OOps.trial.Recurssion;

public class factbulk {
    // recursion means self called method
    public static int bombblast(int n){
        if (n==1){
            return 1;
        }
        return n*bombblast(n-1);


    }

    public static void main(String[] args) {
        System.out.println(bombblast(5));
    }
}
