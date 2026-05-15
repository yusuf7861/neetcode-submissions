class Solution {

    // Using HashSet
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;

            Set<Integer> set = new HashSet<>();

            for(int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if(set.contains(third)) {
                    ans.add(Arrays.asList(nums[i], nums[j], third));

                    while (j + 1 < n && nums[j] == nums[j+1]) j++;
                }
                set.add(nums[j]);
            }
        }

        return ans;
    }
}