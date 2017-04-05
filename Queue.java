public class Queue
{
  int index = 0;
  int[] queue;
  int max;
  public Queue(int max)
  {
    queue = new int[max];
    this.max = max;
  }
  public void enqueue(int b) // method takes in a parameter
  {
    queue[index] = b;
    index++;
  }
  public int peek()
  {
    int m = queue[0];
    return m;
  }
  public int dequeue()
  {
    
  }
}