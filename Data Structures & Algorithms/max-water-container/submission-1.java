class Solution {
    public int maxArea(int[] heights) {
        int j = heights.length - 1;
        int i = 0;
        int area = 0;
        while(i < j) {
            int height = j - i;
            int width = Math.min(heights[i], heights[j]);
            area = Math.max(area, height * width);

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return area;
    }
}
