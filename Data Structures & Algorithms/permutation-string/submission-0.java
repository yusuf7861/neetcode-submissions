class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] freq1 = new int[26];

        // frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] windowFreq = new int[26];

            for (int j = i; j < i + s1.length(); j++) {
                windowFreq[s2.charAt(j) - 'a']++;
            }

            if (Arrays.equals(freq1, windowFreq)) {
                return true;
            }
        }

        return false;
    }
}
