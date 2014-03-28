public class basic_queue{

  private int front, rear;
  private int[] buffer;
  private int queueSize = 10;

  public basic_queue(){
    front = 0;
    rear = 0;
    buffer = new int[queueSize];
  }

  void push(int value)
  {
    int index = rear + 1;
    rear++;
    buffer[index] = value;

  }

  int pop()
  {
    int index = front + 1;
    front++;
    int value = buffer[index];
    return value;
  }

}
