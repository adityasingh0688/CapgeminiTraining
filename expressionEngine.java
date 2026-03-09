package JavaDay01.fiveProblems;

import java.util.*;

class expressionEngine {
  static Stack<Integer> history = new Stack<>();

  public static void main(String[] args) {
    String infix = "(10+5)*2";
    if (!isValid(infix)) {
      System.out.println("Invalid Expression");
      return;
    }
    String postfix = infixToPostfix(infix);
    int result = evaluatePostfix(postfix);
    history.push(result);
    System.out.println("Result: " + result);
    undo();
  }

  static boolean isValid(String s) {
    Stack<Character> st = new Stack<>();
    for (char ch : s.toCharArray()) {
      if (ch == '(')
        st.push(ch);
      else if (ch == ')') {
        if (st.isEmpty())
          return false;
        st.pop();
      }
    }
    return st.isEmpty();
  }

  static int precedence(char op) {
    if (op == '+' || op == '-')
      return 1;
    if (op == '*' || op == '/')
      return 2;
    return 0;
  }

  static String infixToPostfix(String s) {
    Stack<Character> ops = new Stack<>();
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isDigit(ch)) {
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
          res.append(s.charAt(i++));
        }
        res.append(" ");
        i--;
      } else if (ch == '(') {
        ops.push(ch);
      } else if (ch == ')') {
        while (ops.peek() != '(') {
          res.append(ops.pop()).append(" ");
        }
        ops.pop();
      } else {
        while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
          res.append(ops.pop()).append(" ");
        }
        ops.push(ch);
      }
    }

    while (!ops.isEmpty()) {
      res.append(ops.pop()).append(" ");
    }

    return res.toString();
  }

  static int evaluatePostfix(String s) {
    Stack<Integer> st = new Stack<>();

    for (String token : s.split(" ")) {
      if (token.isEmpty())
        continue;

      if (Character.isDigit(token.charAt(0))) {
        st.push(Integer.parseInt(token));
      } else {
        int b = st.pop();
        int a = st.pop();

        switch (token.charAt(0)) {
          case '+':
            st.push(a + b);
            break;
          case '-':
            st.push(a - b);
            break;
          case '*':
            st.push(a * b);
            break;
          case '/':
            st.push(a / b);
            break;
        }
      }
    }
    return st.pop();
  }

  static void undo() {
    if (!history.isEmpty()) {
      history.pop();
    }
    if (history.isEmpty()) {
      System.out.println("No previous result");
    } else {
      System.out.println("Previous result: " + history.peek());
    }
  }
}
