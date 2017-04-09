public class Queue
{
  Node head;
  public Queue()
  {
    
  }
  public void enqueue(int b) // add item to fron of the list
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
}