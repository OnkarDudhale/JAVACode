import java.util.*;
class QueueINStack
{
   
     static Stack<Integer> s1=new Stack<>(); 
     static Stack<Integer> s2=new Stack<>();

     static boolean isEmpty()
     {
         return s1.isEmpty();
     }
     static void add(int data)
     {
         while(!s1.isEmpty())
         {
            s2.push(s1.pop());
         }

        if(isEmpty())
        s1.push(data);

         while(!s2.isEmpty())
         {
            s1.push(s2.pop());
         }
     }
     static void remove()
     {
         if(isEmpty())
         {
             System.out.println("stack is empty..");
             return;
         }
         int front=s1.pop();
         System.out.println(front+"\t");
     }
     public static void main(String arg[])
     {
         QueueINStack q=new QueueINStack();
         q.add(10);
         q.add(20);
         q.add(30);
         q.add(40);

         while(!q.isEmpty())
         {
             q.remove();
         }
    }

}