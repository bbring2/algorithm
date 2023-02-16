class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++) {
            if(foundDivisor(i)%2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
            return answer;
    }
    
    static int foundDivisor(int num) {
        int result = 0;
        
        for(int i=1; i*i <= num; i++) {
            if(i*i == num)
                result++;
            else if(num % i == 0)
                result += 2;
        }
        
        return result;
    }
}