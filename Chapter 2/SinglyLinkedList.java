public class SinglyLinkedList{

  private Node head;
  private Node tail;
  private Node temp;
  private int size;

  public SinglyLinkedList()
  {
    head = null;
    tail = null;
    size = 0;
  }

  public void appendtotail(int data)
  {
    if(head == null)
    {
      head = new Node(data);
      tail = head;
      size++;
    }
    else
    {
      temp = new Node(data);
      tail.next = temp;
      tail = tail.next;
      tail.next = null;
      size++;

    }
  }

  public Node getHead()
  {
    return head;
  }


  public void print()
  {
    temp = head;
    while(temp != null)
    {
      System.out.println(temp.getData());
      temp = temp.next;
    }
  }

  public int getSize()
  {
    return size;
  }

}
