class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int cur = nums[i];
            if(map.containsKey(cur)){
                return new int[]{map.get(cur),i};
            }else{
                map.put(target-cur, i);
            }
        }
        return new int[2];
        
    }
}
