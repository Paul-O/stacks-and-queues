public class Queue
{
  Node head;
  public Queue()
  {
    
  }
  public void enqueue(int b) // add item to front of the list
  {
    Node j = new Node(b);
    if(head == null)
    {
      head = j;
    }
    else
    {
      j.setNext(head);
      head = j;
    }
  }
  public void print()
  {
    Node u = head;
    while(u != null)
    {
      System.out.println(u.getData());
      u = u.getNext();
    }
  }
}