package JavaDay01.fiveProblems;

import java.util.Stack;

public class stackImplementation {
  static class MinMaxStack {
    Stack<Long> st = new Stack<>();
    long min, max;

    void push(long x) {
      if (st.isEmpty()) {
        st.push(x);
        min = max = x;
      } else if (x < min) {
        st.push(2 * x - min);
        min = x;
      } else if (x > max) {
        st.push(2 * x - max);
        max = x;
      } else {
        st.push(x);
      }
    }

    void pop() {
      long top = st.pop();
      if (top < min) {
        min = 2 * min - top;
      } else if (top > max) {
        max = 2 * max - top;
      }
    }

    long getMin() {
      return min;
    }

    long getMax() {
      return max;
    }
  }

  public static void main(String[] args) {
    MinMaxStack s = new MinMaxStack();
    s.push(5);
    s.push(3);
    s.push(7);
    s.push(2);
    s.pop();
    System.out.println(s.getMin());
    System.out.println(s.getMax());
  }
}
