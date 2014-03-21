import java.util.*;

public class question_five
{
  public static String removeSpace(String word)
  {
    String noSpace = word;
    char[] array = word.toCharArray();
    int count_spaces = 0;
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] == ' ')
      {
        count_spaces++;
      }
    }
    int newStringLength = array.length + count_spaces*2;
    char[] array_two = new char[newStringLength];
    int z = 0;
    for(int i = 0; i<array.length; i++)
    {
      if(array[i] == ' ')
      {
        array_two[z] = '%';
        array_two[z+1] = '2';
        array_two[z+2] = '0';
        z = z + 3;
      }
      else
      {

        array_two[z] = array[i];
        z++;
      }
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<array_two.length; i++)
    {
      sb.append(array_two[i]);
    }
    System.out.println("spaces " + count_spaces);
    noSpace = sb.toString();
    return noSpace;
  }

  public static void main(String[] args)
  {
    String test = "hi my name is cat";
    String result = removeSpace(test);
    System.out.println(result);
  }
}
