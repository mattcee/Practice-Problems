import java.util.*;
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

  /*public void deleteNode_two()
  {
    if(head == null)
    {
      return;
    }
    else
    {
      Node prev = head;
      Node current = prev.next;
      while(current != null)
      {
        Node runner = head;
        while(runner != current)
        {
          if(runner.getData() == curret.getData() )
          {
            Node temp = current.next;
            prev.next = temp;
            current = temp;
            break;
          }
          runner = runner.next;
        }
        if(runner == curent)
        {
          prev == current;
          current = current.next;
        }
      }
    }
  }*/

  /*

  public void delete_two()
  {
    //check the first node
    if(head == null)
    {
      return;
    }
    //track the previous node
    Node prev = head;
    //track the current node
    Node current = prev.next;
    //first pointer
    while(current != null)
    {
      Node runner = head;
      System.out.println("currnet : " + current.getData());

      while(runner != current)
      {
        if(runner.getData() == current.getData())
        {
          //System.out.println("hit");
          Node temp = current.next;
          if(current.next == null)
          {
            prev.next = null;
            current.next = null;
          }
          else
          {
            prev.next = current.next;
            current = current.next;

          }
        }
        //System.out.println("runner : " +runner.getData());
        runner = runner.next;
      }
      //System.out.println("");
      //System.out.println("");
      if(current == runner)
      {

        prev = current;
        //System.out.println(current.getData());
        current = current.next;

      }
    }

  }
*/

  public boolean deleteNode(Node n)
  {
    //if the current node or the next node is null this cannot be done.
    if(n == null || n.next == null)
    {
      //return false since the job was unable to finish
      return false;
    }
    Node temp = n.next;
    n.setData(temp.getData());
    n.next = temp.next;
    Node current = head;

    while(current !=null)
    {
      System.out.println(current.getData());
      current = current.next;

    }

    return true;
  }


  public void delete_two()
  {
    //check if the head is null
    if(head == null)
    {
      return;
    }
    else
    {
      //reference to the head Node
      Node prev = head;
      //choose the next element as the current
      Node current = prev.next;
      //check if current is equal to null
      while(current != null)
      {
        //create a runner to go through the nodes
        Node runner = head;
        //check if the nodes are the same node
        while(runner != current)
        {
          //if the data are the same at two nodes remove one
          if(current.getData() == runner.getData())
          {
            //point to the next current node
            Node temp = current.next;
            //point the previous node to this new node
            prev.next = temp;
            //our new current spot in the current.next because the previous current was removed
            current = current.next;
            //stop the while loop after removing a node
            break;
          }
          //increment the runner to go through the linkedlist until we hit runner = current
          runner = runner.next;
        }
        //if the two nodes are the same then the previous is the current node
        if(current == runner)
        {
          prev = current;
          //incremement current to compare the next current with the runner node
          current = current.next;

        }
      }
    }
  }


  public void deleteRepeat()
  {
    Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
    Node n = head;
    Node prev = null;
    while(n != null)
    {
      if(table.containsKey(n.getData()))
      {

        if(n.next == null)
        {
          prev.next = null;
          return;
        }
        else
        {
          prev.next = n.next;
        }

      }
      else
      {
        table.put(n.getData(), true);
        prev = n;
        //System.out.println(prev.getData());

      }
      n = n.next;
    }


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
