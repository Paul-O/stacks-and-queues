public class Stack
{
  Node root = null;
  public Stack()
  {
    
  }
  public void push(int a) // add item to top of stack
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
  public int peek() // use top in stack without removing it
  {
    return root.getData();
  }
  public int pop() // remove item from top of stack
  {
    Node temp = root;
    if(root == null)
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
  public void print()
  {
    Node t = root;
    while(t != null)
    {
      System.out.println(t.getData());
      t = t.getNext();
    }
  }
}