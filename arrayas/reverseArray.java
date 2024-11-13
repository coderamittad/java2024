package arrayas;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
int array[]={11,12,1,4,3,56,7,8};
int swap=array[0];
for (int i=0;i<array.length;i++){
    if (array[i]<array[i+1]){
        array[i]=array[i+1];

    }

    System.out.println(i+"="+array[i]);
}


}}
