public class Stack
{
  Node root = null;
  public Stack()
  {
    
  }
  public void push(int a)
  {
    Node i = new Node(a);
    if(root == null)
    {
      root = i;
    }
    else
    {
      i.setNext(root);
      root = i;
    }
  }
  public int peek()
  {
    return root.getData();
  }
  public int pop()
  {
    Node temp = root;
    if(root == null;)
    {
      return 0;
    }
    else if(root.getNext() == null)
    {
      root = null;
      return temp.getData();
    }
    else
    {
      root = root.getNext();
      return temp.getData();
    }
  }
}