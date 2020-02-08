package MedianOfTwoSortedArrays;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalSz = nums1.length + nums2.length;
        if(nums1.length == 0) {
            if(totalSz % 2 == 0) {
                if(totalSz == 1) return nums2[0];
                else return (double) (nums2[totalSz / 2] + nums2[totalSz / 2 - 1]) / 2;
            } else return (double) nums2[totalSz / 2];
        } else if(nums2.length == 0) {
            if(totalSz % 2 == 0) {
                if(totalSz == 1) return nums1[0];
                else return (double) (nums1[totalSz / 2] + nums1[totalSz / 2 - 1]) / 2;
            } else return (double) nums1[totalSz / 2];
        } else if(totalSz % 2 == 0) {
            int medianIdx = totalSz / 2 + 1;
            int i = 0;
            int j = 0;
            int prev = 0;
            int current = 0;
            for(int k=0; k<medianIdx; k++) {
                if(i > nums1.length - 1) {
                    prev = current;
                    current = nums2[j];
                    j++;
                } else if(j > nums2.length - 1) {
                    prev = current;
                    current = nums1[i];
                    i++;
                } else if(nums1[i] < nums2[j]) {
                    prev = current;
                    current = nums1[i];
                    i++;
                } else {
                    prev = current;
                    current = nums2[j];
                    j++;
                }
            }
            return (double) (prev + current) / 2;
        } else {
            int medianIdx = totalSz / 2;
            int i = 0;
            int j = 0;
            int median = 0;
            for(int k=0; k<medianIdx + 1; k++) {
                if(i > nums1.length - 1) {
                    median = nums2[j];
                    j++;
                } else if(j > nums2.length - 1) {
                    median = nums1[i];
                    i++;
                } else if(nums1[i] < nums2[j]) {
                    median = nums1[i];
                    i++;
                } else {
                    median = nums2[j];
                    j++;
                }
            }

            return (double) median;
        }
    }
}
