package String;

import java.util.HashMap;

public class LongestCommonSub_String1 {
    public static int lengthOfLongestSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);
            if (lastIndex.containsKey(currentChar)) {
                // Move start to avoid repeating character
                start = Math.max(start, lastIndex.get(currentChar) + 1);
            }
            lastIndex.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str ="abcbadbc";
        System.out.println("Longest Common Substring Without Repeat is: "+lengthOfLongestSubstring(str));
    }
}
