package JavaDay01.fiveProblems;

import java.util.Stack;

public class celebrityProblem {
  static int findCelebrity(int[][] M, int n) {
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < n; i++) {
      st.push(i);
    }
    while (st.size() > 1) {
      int a = st.pop();
      int b = st.pop();
      if (M[a][b] == 1) {
        st.push(b);
      } else {
        st.push(a);
      }
    }
    int cand = st.pop();

    for (int i = 0; i < n; i++) {
      if (i != cand) {
        if (M[cand][i] == 1 || M[i][cand] == 0) {
          return -1;
        }
      }
    }
    return cand;
  }

  public static void main(String[] args) {
    int[][] M = {
        { 0, 1, 0 },
        { 0, 0, 0 },
        { 0, 1, 0 } };
    int n = M.length;
    int res = findCelebrity(M, n);
    System.out.println(res);
  }
}
