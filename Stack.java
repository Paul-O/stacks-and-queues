public class Stack
{
  int top = 0;
  int[] stack;
  int maxSize;
  public Stack(maxSize)
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
}