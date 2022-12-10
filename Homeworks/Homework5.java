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