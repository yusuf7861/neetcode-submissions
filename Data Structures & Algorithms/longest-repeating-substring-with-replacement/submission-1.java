class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;

        int left = 0;
        int maxFreq = 0;
        
        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {


            char currChar = s.charAt(right);

            freq[currChar - 'A']++;

            maxFreq = Math.max(maxFreq, freq[currChar - 'A']);

            int windowLen = right - left + 1;

            if (windowLen - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
