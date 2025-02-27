/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.Map;
import java.util.HashMap;
class twoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;  i< nums.length; i++){
            int valorSuma1= nums[i];
            for(int j=1; j<nums.length; j++){
                if ((valorSuma1+nums[j]==target) && (i != j)){
                    return  new int[] {i, j};
                }
            }

        }
        return null;
    }

    //This version works with map, we´re looking for a O(n) time difficulty
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> diccNumeros =new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int complementoSuma = target -nums[i];
            if(diccNumeros.containsKey(complementoSuma)){
                return new int[] {i,diccNumeros.get(complementoSuma)};
            }
            diccNumeros.put(nums[i],i);
        }
        return new int [0];
    }
}