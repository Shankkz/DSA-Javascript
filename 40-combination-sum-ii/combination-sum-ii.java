import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int target, int start,
                           List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) continue;
            if (nums[i] > target) break;

            curr.add(nums[i]);
            backtrack(nums, target - nums[i], i+1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}