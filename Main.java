public class Main
{
  public static void main(String[] args)
  {
    //Stack to Queue
    System.out.println("Stack to Queue\nStack:");
    Stack s = new Stack();
    s.push(12);
    s.push(34);
    s.push(51);
    s.print();
    System.out.println("\nQueue:");
    Queue q = new Queue();
    for(int c = 1; c < 4; c++)
    {
      q.enqueue(s.pop());
    }
    q.print();
    //Queue to Stack
    System.out.println("\nQueue to Stack\n");
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
    //Stack to Stack
    System.out.println("\nStack to Stack\n");
    Stack h = new Stack();
    Stack p = new Stack();
    for(int f = 1; f < 4; f++)
    {
      h.push(w.pop());
    }
    for(int g = 1; g < 4; g++)
    {
      p.push(h.pop());
    }
    p.print();
  }
}