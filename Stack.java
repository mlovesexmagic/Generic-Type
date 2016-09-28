/*Zhipeng (Adrian) Mei
  Sept 28, 2016 
  Purpose: Convert the Stack class into a generic class
 */
import java.util.*;

public class Stack<T>
{
   private ArrayList<T> myList;
    
   public Stack()
   {
      myList = new ArrayList<T>();
   }

   public void push(T item)
   {
      myList.add(item);
   }

   public T pop()
   {
      T retItem = null;
      if (!myList.isEmpty())
      {
         retItem = myList.remove(myList.size() - 1);
      }
      return retItem;
   }

   public boolean  empty()
   {
      return myList.isEmpty();
   }
}