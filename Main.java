public class Main
{
  public static void main(String[] args)
  {
    Stack s = new Stack(4);
    s.push(4);
    s.push(5);
    s.push(7);
    s.push(2);
    System.out.println(s.peek() + " is the current top of the stack");
    s.pop();
    s.pop();
    System.out.println(s.peek() + " is the current top of the stack");
  }
}