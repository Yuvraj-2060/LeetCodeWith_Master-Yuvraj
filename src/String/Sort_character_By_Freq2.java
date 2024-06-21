package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Sort_character_By_Freq2 {
    public static String frequencySort(String s) {
        int n = s.length();
        HashMap<Character, Integer> hs = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < n; i++) {
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Sort the characters based on their frequencies
        List<Character> sortedChars = new ArrayList<>(hs.keySet());
        Collections.sort(sortedChars, (a, b) -> hs.get(b) - hs.get(a));

        // Build the sorted string
        StringBuilder str = new StringBuilder();
        for (char ch : sortedChars) {
            int count = hs.get(ch);
            for (int i = 0; i < count; i++) {
                str.append(ch);
            }
        }

        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println("After Sorting Character By Frequency: "+frequencySort("missicipii"));
        System.out.println("After Sorting Character By Frequency: "+frequencySort("missicipii"));

    }
}
