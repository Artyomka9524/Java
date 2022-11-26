package Homeworks;

public class homework1 {
    
}

// Task1

class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            prod = prod * (n % 10);
            sum += n % 10;

            n /= 10;
        }
        return prod - sum;
    }
}