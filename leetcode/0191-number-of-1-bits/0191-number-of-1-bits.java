public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result  = 0;
        
        for(int i = 0; i < 32; i++) {
            int mask = (1 << i);
            if((n & mask) != 0) {
                result++;
            }
        }
        
        return result;
    }
}