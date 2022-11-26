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
            } 
            else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}

// Task2
//http://joxi.ru/V2VJpv0iBjY9w2
class Solution {
    public int[] buildArray(int[] nums) {
        
        int[] an = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            an[i] = nums[nums[i]];

        }
        return an;
    }
}

// Task3
// http://joxi.ru/EA4G1b0iXVxLj2

class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == val)
                ++cnt;
            else
                nums[i - cnt] = nums[i];
        }
        return n - cnt;
    }
}

// Task4
// http://joxi.ru/a2XgDYjuQ6g01m

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(words.length);
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() != 0) {
                if (result.length() != 0) {

                    result.append(" ");
                }

                result.append(words[i]);
            }
        }

        return result.toString();
    }
}

