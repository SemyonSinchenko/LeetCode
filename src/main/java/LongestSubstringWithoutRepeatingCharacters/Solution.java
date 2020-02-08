package LongestSubstringWithoutRepeatingCharacters;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        int maxLength = 0;
        LinkedHashSet<Character> currentSubStr = new LinkedHashSet<>();
        currentSubStr.add(s.charAt(0));

        for(int i=1; i<s.length(); i++) {
            if(currentSubStr.contains(s.charAt(i))) {
                maxLength = Math.max(maxLength, currentSubStr.size());
                for(Iterator<Character> it = currentSubStr.iterator(); it.hasNext();) {
                    Character c = it.next();
                    if(c == s.charAt(i)) {
                        it.remove();
                        break;
                    } else {
                        it.remove();
                    }
                }
                currentSubStr.add(s.charAt(i));
            } else {
                currentSubStr.add(s.charAt(i));
            }
        }

        maxLength = Math.max(maxLength, currentSubStr.size());

        return maxLength;
    }
}
