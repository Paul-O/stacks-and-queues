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
      Node temp = head;
      while(temp.getNext() != null)
      {
        temp = temp.getNext();
      }
      temp.setNext(j);
    }
  }
  public int peek()
  {
    return head.getData();
  }
  public int dequeue()
  {
    Node temp = head;
    if(head == null)
    {
      return 0;
    }
    else if(head.getNext() == null)
    {
      head = null;
      return temp.getData();
    }
    else
    {
      head = head.getNext();
      temp.setNext(null);
      return temp.getData();
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