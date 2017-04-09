public class Main
{
  public static void main(String[] args)
  {
    Stack s = new Stack();
    s.push(12);
    s.push(34);
    s.push(51);
    s.print();
    System.out.println(" ");
    Queue q = new Queue();
    for(int c = 1; c < 4; c++)
    {
      q.enqueue(s.pop());
    }
    q.print();
    System.out.println(" ");
    Stack r = new Stack();
    Stack w = new Stack();
    for(int d = 1; d < 4; d++)
    {
      r.push(q.dequeue());
    }
    for(int e = 1; e < 4; e++)
    {
      w.push(r.pop());
    }
    w.print();
  }
}