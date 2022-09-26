class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nummap = new HashMap<>();
        for(int i=0; i<nums.length; i++){            
            if(nummap.containsKey(target-nums[i])){
                return new int[] {nummap.get(target-nums[i]),i};
            }
            nummap.put(nums[i],i);
        }
        throw new IllegalArgumentException("uh-oh");
    }
}