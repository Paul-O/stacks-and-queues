public class Stack
{
  int top = 0;
  int[] stack;
  int maxSize;
  public Stack(int maxSize)
  {
    stack = new int[maxSize];
    this.maxSize = maxSize;
  }
  public void push(int a) // method takes in a parameter
  {
    stack[top] = a;
    top++;
  }
  public int peek()
  {
    int x = stack[top - 1];
    System.out.println(x + " is the top");
    return x;
  }
  public int pop()
  {
    int y = stack[top - 1];
    System.out.println(y + " is the top");
    top--;
    return y;
  }
}