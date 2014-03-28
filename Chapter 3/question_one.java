import java.util.*;
public class question_one{
  //0 - n/3
  //n/3 - 2n/3
  //2n/3 - n
  int size = 100;
  int[] buffer =new int[size * 3];
  int[] stackPointer = {0,0,0};


  void push(int stackNum, int value)
  {
    int index = stackNum * size + stackPointer[stackNum] + 1;
    stackPointer[stackNum]++;
    buffer[index] = value;
  }
  int peek(int stackNum)
  {
    int index = stackNum*size + stackPointer[stackNum];
    int value  = buffer[index];
    return value;

  }

}
