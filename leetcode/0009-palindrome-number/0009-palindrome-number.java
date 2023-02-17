class Solution {
    public boolean isPalindrome(int x) {
        String intStr = String.valueOf(x);
    String reverseStr = "";

    if(intStr.startsWith("-")) {
      return false;
    }

    for(int i=intStr.length()-1; i>=0; i--) {
      reverseStr = reverseStr + intStr.charAt(i);
    }

    return intStr.equals(reverseStr);
    }
}