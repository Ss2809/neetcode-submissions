class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] finalArray = new int[n];
        for (int i = 0; i < nums1.length; i++) {
            finalArray[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            finalArray[nums1.length + i] = nums2[i];
        }
        Arrays.sort(finalArray);
        if (n % 2 != 0) {
            return finalArray[n / 2];
        } else {
            return (finalArray[n / 2 - 1] + finalArray[n / 2]) / 2.0;
        }
    }
}
