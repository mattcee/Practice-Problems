import java.util.*;

public class question_one
{

  public static void main(String[] args)
  {

    SinglyLinkedList t = new SinglyLinkedList();

    t.appendtotail(2);
    t.appendtotail(3);
    t.appendtotail(4);
    t.appendtotail(25);
    t.appendtotail(23);
    t.appendtotail(5);
    t.appendtotail(9);
    t.appendtotail(2);



    t.print();
    System.out.println("");
    System.out.println("Size of List: " +t.getSize());


  }

}
