/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ranjan Kumar
 */
import java.util.*;
public class linked_list {
    public static void main(String[] args){
        String[] a={"1","2","3","4"};
        LinkedList<String> l=new LinkedList<String>();
        for(String x: a)
            l.add(x);
        String[] b={"5","6","7","8"};
        List<String> l2=new LinkedList<String>();
        for(String x: b)
            l2.add(x);
        l.addAll(l2);
        l2=null;
        print(l);
        remove(l,1,4);
        print(l);
        rev(l);
        Collections.sort(l);
        print(l);
        Collections.reverse(l); 
        Collections.sort(l,Collections.reverseOrder());
        print(l);
        
        /*This is how to get and set Values*/
         Object firstvar = l.get(0);
         System.out.println("First element: " +firstvar);
         l.set(0, "Changed first item");
         Object firstvar2 = l.get(0);
         System.out.println("First element after update by set method: " +firstvar2);

         /*Remove first and last element*/
         l.removeFirst();
         l.removeLast();
         System.out.println("LinkedList after deletion of first and last element: " +l);

         /* Add to a Position and remove from a position*/
         l.add(0, "Newly added item");
         l.remove(2);
         System.out.println("Final Content: " +l); 
         
         Iterator it= l.iterator();
         while(it.hasNext()){
             System.out.print(it.next() + " ");
             
         }
         
         // Obtaining ListIterator
    ListIterator listIt = l.listIterator();
 
    // Iterating the list in forward direction
    System.out.println("Forward iteration:");
    while(listIt.hasNext()){
       System.out.println(listIt.next());
    }

    // Iterating the list in backward direction
    System.out.println("\nBackward iteration:");
    while(listIt.hasPrevious()){
       System.out.println(listIt.previous());
    } 
    
    // For iterating in reverse order
    Iterator it1=l.descendingIterator();
    while(it.hasNext())
        System.out.println(listIt.next());
    
    }
    public static void print(List<String> l){
        for(String x:l)
            System.out.print(x+ " ");
        System.out.println();
    }
    public static void remove(List<String> l,int from,int to){
        l.subList(from,to).clear();
    }
    public static void rev(List<String> l){
        ListIterator<String> l1=l.listIterator(l.size());
        while(l1.hasPrevious())
            System.out.print(l1.previous() + " ");
        System.out.println();
    }
}
