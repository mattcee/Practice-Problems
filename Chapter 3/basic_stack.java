public class basic_stack{

  int stackSize;
  int stackPointer;
  int[] buffer;
  int countSize;

  public basic_stack(){
    stackSize = 10;
    stackPointer = 0;
    buffer = new int[stackSize];
  }

  void push(int value)
  {
    int index = stackPointer + 1;
    stackPointer++;
    buffer[index] = value;
    countSize++;
  }
  int peek()
  {
    int index = stackPointer;
    int value = buffer[index];

    return value;
  }
  int pop()
  {
    int index = stackPointer;
    stackPointer--;
    int value = buffer[index];
    countSize--;
    return value;
  }


}
