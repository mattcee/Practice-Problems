import java.util.*;

public class question_one
{

/*  public static void deleteRepeat(Node n)
  {
    Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
    Node prev = null;
    while(n != null)
    {
      if(table.containsKey(n.getData()))
      {
        prev.next = n.next;
        System.out.println("hit");
      }
      else
      {
        table.put(n.getData(), true);
        System.out.println("miss");
        prev = n;

      }
      n = n.next;
    }



  }
*/


  public static void main(String[] args)
  {

    SinglyLinkedList t = new SinglyLinkedList();
    t.appendtotail(1);
    t.appendtotail(2);
    t.appendtotail(3);
    t.appendtotail(4);
    t.appendtotail(5);
    t.appendtotail(6);
    t.appendtotail(7);



    //t.print();
    System.out.println("");
    System.out.println("Size of List: " +t.getSize());

    System.out.println("");
    System.out.println("");

    //t.deleteRepeat();
    //t.delete_two();

    //delete a node at specific point that is not the end
    //b/c this will not work at the end;
    Node head = t.getHead();
    boolean test = t.deleteNode(head.next.next);
    System.out.println(test);
    //t.print();

    //t.deleteNode();




  }

}
