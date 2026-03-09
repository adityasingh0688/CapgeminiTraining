package JavaDay01.fiveProblems;

import java.util.*;

public class largestHistogram {
  public static int largestRectangleArea(int[] heights) {
    Stack<Integer> st = new Stack<>();
    int maxArea = 0;
    int n = heights.length;
    for (int i = 0; i <= n; i++) {
      int currHeight = (i == n) ? 0 : heights[i];
      while (!st.isEmpty() && currHeight < heights[st.peek()]) {
        int height = heights[st.pop()];
        int width = st.isEmpty() ? i : i - st.peek() - 1;
        maxArea = Math.max(maxArea, height * width);
      }
      st.push(i);
    }
    return maxArea;
  }

  public static void main(String[] args) {
    int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
    System.out.println(largestRectangleArea(arr));
  }
}
