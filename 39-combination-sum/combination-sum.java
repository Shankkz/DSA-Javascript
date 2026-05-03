import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
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
            if (nums[i] > target) continue;
            curr.add(nums[i]);
            backtrack(nums, target - nums[i], i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}