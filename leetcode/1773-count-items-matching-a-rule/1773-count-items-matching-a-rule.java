class Solution {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int out=0;
        int index=0;
        
        if(ruleKey.equals("type")) {
            index=0;
        }

        else if(ruleKey.equals("color")) {
            index=1;

        }
        
        else {
            index=2;
        }
        
        for(List<String> l:items){
            if(l.get(index).equals(ruleValue)){
                out += 1;
            }
        }
        
        return out;
        
    }
}