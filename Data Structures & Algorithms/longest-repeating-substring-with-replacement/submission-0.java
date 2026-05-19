class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < n; j++) {
                char currChar = s.charAt(j);

                freq[currChar - 'A']++;

                maxFreq = Math.max(maxFreq, freq[currChar - 'A']);

                int windowLength = j - i + 1;

                int replacementNeeded = windowLength - maxFreq;

                if (replacementNeeded <= k) {
                    maxLen = Math.max(maxLen, windowLength);
                }
            }
        }

        return maxLen;
    }
}
