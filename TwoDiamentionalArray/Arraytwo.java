package TwoDiamentionalArray;

public class Arraytwo {
    public static void main(String[] args) {


    int arr[][]={
            {1,2,3,4},
            {11,22,33,3},
            {44,55,66,4},
            {22,33,44,33}

    };
  /*  String arra[][]={
            {"amit","gangadhar","tad"},
            {"ajit","gangadhar","tad"},
            {"amit","gangadhar","tad"}

    };*/
        String arra[][]=new String[3][3];
        arra[0][0]="amit";
        arra[0][1]="gangadhar";
        arra[0][2]="amit";
        arra[1][0]="amita";
        arra[1][1]="amit";
        arra[1][2]="amit";
        arra[2][0]="amit";
        arra[2][1]="amit";
        arra[2][2]="amit";


        for (int i = 0; i < arra.length ; i++) {
            for (int j = 0; j < arra.length ; j++) {
                System.out.println(arra[i][j]);

            }

        }
        /*System.out.println(arr[1][2]);*/
       /* for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println("");
        }*/

}}
