package JavaDay01.fiveProblems;

import java.util.*;

class jvmStimulation {
  static Stack<String> callStack = new Stack<>();

  public static void main(String[] args) {
    mainMethod();
  }

  static void mainMethod() {
    push("main()");
    login();
    pop();
  }

  static void login() {
    push("login()");
    validate();
    pop();
  }

  static void validate() {
    push("validate()");
    pop();
  }

  static void push(String method) {
    callStack.push(method);
    printStack("CALL " + method);
  }

  static void pop() {
    String method = callStack.pop();
    printStack("RETURN " + method);
  }

  static void printStack(String action) {
    System.out.println("\n" + action);
    System.out.println("Current Call Stack:");

    if (callStack.isEmpty()) {
      System.out.println("[ empty ]");
      return;
    }

    for (int i = callStack.size() - 1; i >= 0; i--) {
      System.out.println(callStack.get(i));
    }
  }
}
