package Homeworks;

public class Homework5 {
    
}


//Task1
//http://joxi.ru/Q2K34qkIOKKg42

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

//Task2
//http://joxi.ru/MAjDJencdMMYDm

class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        Map<String, int[]> common = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < words1.length; i++) {
            String word = words1[i];
            int[] counter = common.getOrDefault(word, new int[]{0, 0});
            counter[0]++;
            common.put(word, counter);
        }
        
        for(int i = 0; i < words2.length; i++) {
            String word = words2[i];
            int[] counter = common.getOrDefault(word, null);
            if(counter != null) {
                if(counter[0] == 1 && counter[1] == 0) {
                    count++;
                } else if(counter[0] == 1 && counter[1] == 1) {
                    count--;
                }
                counter[1]++;
            }
        }
        
        return count;
    }
}

//Task3
//http://joxi.ru/VrwDneGco99gPm

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums1) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        List<Integer> t = new ArrayList<>();
        for (int num : nums2) {
            if (counter.getOrDefault(num, 0) > 0) {
                t.add(num);
                counter.put(num, counter.get(num) - 1);
            }
        }
        int[] res = new int[t.size()];
        for (int i = 0; i < res.length; ++i) {
            res[i] = t.get(i);
        }
        return res;
    }
}