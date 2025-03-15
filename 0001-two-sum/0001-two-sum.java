class Solution {
    public int[] twoSum(int[] nums, int target) {
        //DS: Array
        //A: HashMap
        //O(n)
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int secondNum = target - nums[i];
            if(map.containsKey(secondNum)){
                result[0] = map.get(secondNum);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}