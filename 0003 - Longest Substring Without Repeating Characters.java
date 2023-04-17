class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
      
        int longest = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            HashSet<Character> uniqueChars = new HashSet<>();
            uniqueChars.add(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {
                var c = s.charAt(j);

                if (uniqueChars.contains(c)) {
                    break;
                }

                uniqueChars.add(c);
            }

            if (longest < uniqueChars.size()) {
                longest = uniqueChars.size();
            }
        }

        return longest;
    }
}
