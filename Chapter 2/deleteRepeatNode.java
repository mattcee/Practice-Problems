import java.util.*;
public class deleteRepeatNode{

  public deleteRepeatNode()
  {

  }

  public static void deleteRepeatNodeHash(Node n)
  {
    Hashtable table = new Hashtable();
    Node prev = null;

    while(n != null)
    {
      if(table.containsKey(n.getData()))
      {
        prev.next = n.next;
      }
      else
      {
        table.put(n.getData(), true);
        prev = n;
      }
      n = n.next;
    }
  }
}
