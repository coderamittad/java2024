package arrayas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class addtwisum {

    public static int[] twosum(int[]nums, int target){
        Map<Integer,Integer>findIndex=new HashMap<>();
        int SizeofArray=nums.length;
        for(int i = 0; i <SizeofArray; i++) {
            // Calculate the difference between the target and the current number
            int diff = target - nums[i];

            // Check if the difference already exists in the map
            if(findIndex.containsKey(diff)) {
                // If it exists, return the indices of the current number and the number that adds up to the target
                return new int[]{i, findIndex.get(diff)};
            }

            // If it doesn't exist, add the current number and its index to the map
            findIndex.put(nums[i], i);
        }

        // If no two numbers add up to the target, return null
        return null;
    }
    public static void main(String[] args) {
        int target=10;
        int nums[]={11,2,3,5,7,8};
        System.out.println(twosum(nums,target));

    }


}


