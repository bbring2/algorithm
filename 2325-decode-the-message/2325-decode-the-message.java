class Solution {
    public String decodeMessage(String key, String message) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        //String 중복 제거
        String distinctString = Arrays.stream(key.split(""))
                .distinct()
                .filter(it -> !it.equals(" "))
                .collect(Collectors.joining());

        System.out.println(distinctString);

        //hashTable에 넣기
        Map<Character, Character> tmpMap = new HashMap<>();

        for(int i=0; i<26; i++) {
            tmpMap.put(distinctString.charAt(i), alphabet[i]);
        }

        System.out.println(tmpMap);

        StringBuilder result = new StringBuilder();

        for(int i=0; i<message.length(); i++) {
            if(message.charAt(i) == ' ') {
                result.append(" ");
            } else {
                result.append(tmpMap.get(message.charAt(i)));
            }
        }

        return result.toString();
    }
}