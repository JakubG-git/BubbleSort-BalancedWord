package jg;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {
    //The word is balanced if every letter that occurs in it occurs in the same number of time. E.g. the words: “mama”, “ear”, “aabbcbcccbaa”
    //are balanced, but the words: “mam”, “eara”, “aabbcbcccba” are not balanced.

    public int count(String input) {

        int count = 0;
        if (input == null) {
            throw new RuntimeException("null");
        }
        if (input.isEmpty()) {
            return count;
        }
        if (!charOnly(input)) {
            throw new RuntimeException("not letter");
        }
        int length = input.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                if (checkSubword(input.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean checkSubword(String subword){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < subword.length(); i++) {
            if (map.containsKey(subword.charAt(i))) {
                map.put(subword.charAt(i), map.get(subword.charAt(i)) + 1);
            } else {
                map.put(subword.charAt(i), 1);
            }
        }
        int max = Collections.max(map.values());

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != max) {
                return false;
            }
        }
        return true;
    }

    private boolean charOnly(String input) {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetter(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

