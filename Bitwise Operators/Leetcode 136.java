class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num; 
        }
        return unique; 
    }
}

XOR - operation

1^1 , 0^0 => 0
1^0       => 1

Intuition

0 ^ with any number same number
N ^ N , gives 0
