class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] tmpArr = my_string.split("");
        
        for(int i=tmpArr.length-1; i>=0; i--) {
            answer += tmpArr[i];
        }
        return answer;
    }
}