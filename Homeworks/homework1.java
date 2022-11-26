package Homeworks;

public class homework1 {
    
}

// Task1
// http://joxi.ru/D2PkEyNTwLRGjm
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}

// Task2
http://joxi.ru/V2VJpv0iBjY9w2
class Solution {
    public int[] buildArray(int[] nums) {
        
        int[] an = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            an[i] = nums[nums[i]];

        }
        return an;
    }
}