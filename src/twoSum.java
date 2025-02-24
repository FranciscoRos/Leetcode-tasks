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
}