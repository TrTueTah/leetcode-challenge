import java.util.HashMap;
import java.util.Map;

class Solution {
    // Solution 1: Using HashMap
    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) return false;

    //     Map<Character, Integer> store = new HashMap<>();

    //     for(int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         store.put(ch, store.getOrDefault(ch, 0) + 1);
    //     }

    //     for(int i = 0; i < t.length(); i++) {
    //         char ch = t.charAt(i);
    //         if (!store.containsKey(ch) || store.get(ch) == 0) return false;
    //         store.put(ch, store.get(ch) - 1);
    //     }

    //     return true;
    // }
    // Solution 2: Counting ASCII value
    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) return false;

    //     int[] count = new int[26];

    //     for (int i = 0; i < s.length(); i++) {
    //         count[s.charAt(i) - 'a'] += 1;
    //     }

    //     for (int i = 0; i < t.length(); i++) {
    //         if(count[t.charAt(i) - 'a'] == 0) return false;
    //         count[t.charAt(i) - 'a'] -= 1;
    //     }
    //     return false;
    // }
    // Solution 3: Comparing HashMap
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            sCount.put(s.charAt(i), 1 + sCount.getOrDefault(s.charAt(i), 0));
            tCount.put(t.charAt(i), 1 + tCount.getOrDefault(t.charAt(i), 0));
        }
        return sCount.equals(tCount);
    }
}