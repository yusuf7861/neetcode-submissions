class Solution {

    // OPTIMAL APPROACH
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // initialize freq map for s1 and s2
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        // slide the window through s2 and compare the maps
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }

            freq2[s2.charAt(i+s1.length()) - 'a']++; // add new character to the window
            freq2[s2.charAt(i) - 'a']--;
        }

        return Arrays.equals(freq1, freq2);
    }
}
