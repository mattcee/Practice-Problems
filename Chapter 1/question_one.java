public class question_one{

  public static boolean uniqueChar(String word){
    boolean[] char_set = new boolean[256];
    for(int i = 0; i< word.length(); i++)
    {
      int value = word.charAt(i) - 'a';
      System.out.println(word.charAt(i) + " value: " + value);
      if(char_set[value])
      {
        return false;
      }
      else
      {
        char_set[value] = true;
      }
    }
    return true;

  }

  public static void main(String[] args)
  {
    		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for(String word : words)
        {
          System.out.println(word + " is unique? " + uniqueChar(word));
        }
  }
}
