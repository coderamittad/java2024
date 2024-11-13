package OOps.trial.Method;

public class variableargument {
    public static void addeNumber(int... a) {
        int sum = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println("sum of number is=" + sum);

    }

    public static void main(String[] args) {
        addeNumber(10, 12, 13, 1, 2, 3, 4);

    }


}
