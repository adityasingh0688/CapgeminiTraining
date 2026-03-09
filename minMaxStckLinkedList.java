package JavaDay01.fiveProblems;

public class minMaxStckLinkedList {
  static class Node {
    long data;
    Node next;

    Node(long data) {
      this.data = data;
      this.next = null;
    }
  }

  static class MinMaxStack {
    Node head;
    long min, max;

    void push(long x) {
      if (head == null) {
        head = new Node(x);
        min = max = x;
      } else if (x < min) {
        long changed = 2 * x - min;
        Node n = new Node(changed);
        n.next = head;
        head = n;
        min = x;
      } else if (x > max) {
        long encoded = 2 * x - max;
        Node n = new Node(encoded);
        n.next = head;
        head = n;
        max = x;
      } else {
        Node n = new Node(x);
        n.next = head;
        head = n;
      }
    }

    void pop() {
      if (head == null)
        return;

      long top = head.data;
      head = head.next;

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
    s.push(45);
    s.push(2);
    s.pop();

    System.out.println("minimum element : " + s.getMin());
    System.out.println("maximum element : " + s.getMax());
  }
}
