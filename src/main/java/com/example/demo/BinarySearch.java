package com.example.demo;

public class BinarySearch {

    public int plainBinarySearch(int[] nums, int target) {
        int index = -1;
        int from = 0;
        int to = nums.length - 1;

        while (from <= to) {
            int middle = from + (to - from) / 2;
            if (target == nums[middle]) {
                return middle;
            }
            if (target < nums[middle]) {
                to = middle - 1;
            } else {
                from = middle + 1;
            }
        }
        return index;
    }

    //the target may be missing, return the index where it would be if it were inserted in order.
    public int binarySearchMayBeAbsent(int[] nums, int target) {
        int from = 0;
        int to = nums.length - 1;
        int pivot = 0;

        while (from <= to) {
            pivot = from + (to - from) / 2;
            if (nums[pivot] == target) {
                return pivot;
            }
            if (nums[pivot] > target) {
                to = pivot - 1;
            } else {
                from = pivot + 1;
            }
        }
        return from;
    }
}
