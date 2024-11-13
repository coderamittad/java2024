package arrayas;

public class maxNumber {
    public static void main(String[] args) {
        int arr[]=new int[6];
        arr[0]=-11;
        arr[1]=-12;
        arr[2]=-16;
        arr[3]=-73;
        arr[4]=-15;
        arr[5]=2;
       int result=0;
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]+1>result){
result=arr[i];
            }
            else {
                min=arr[i];

            }
        }
        System.out.println(result);
        System.out.println(min);


    }
}
