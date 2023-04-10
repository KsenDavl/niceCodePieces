package com.example.demo;


import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that
// they add up to target.

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
//if the array is sorted in non-decreasing order, use 2 pointers like this:

//class Solution {
//public:
//    vector<int> twoSum(vector<int>& numbers, int target) {
//        int low = 0;
//        int high = numbers.size() - 1;
//        while (low < high) {
//            int sum = numbers[low] + numbers[high];
//
//            if (sum == target) {
//                return {low + 1, high + 1};
//            } else if (sum < target) {
//                ++low;
//            } else {
//                --high;
//            }
//        }
//        // In case there is no solution, return {-1, -1}.
//        return {-1, -1};
//    }
//};

//For 3 digits sum (==0) use 2 pointers:

//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> res = new ArrayList<>();
//        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
//            if (i == 0 || nums[i - 1] != nums[i]) {
//                twoSumII(nums, i, res);
//            }
//        return res;
//    }
//    void twoSumII(int[] nums, int i, List<List<Integer>> res) {
//        int lo = i + 1, hi = nums.length - 1;
//        while (lo < hi) {
//            int sum = nums[i] + nums[lo] + nums[hi];
//            if (sum < 0) {
//                ++lo;
//            } else if (sum > 0) {
//                --hi;
//            } else {
//                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
//                while (lo < hi && nums[lo] == nums[lo - 1])
//                    ++lo;
//            }
//        }
//    }
//}
