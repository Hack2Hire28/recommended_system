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

public class HashSet_Example {
    public static void main(String[] args){
        HashSet<Integer> hset=new HashSet<Integer>();
        hset.add(2);
        hset.add(1);
        hset.add(5);
        hset.add(3);
        hset.add(4);
        
        //this 2 will not get added as duplicate is not allowed in hashset.
        hset.add(2);
        hset.add(null);
        
        // duplicate null is also not allowed
        hset.add(null);
        
       //Displaying HashSet elements
      System.out.println(hset);
      
      // Displaying Iterator
      Iterator<Integer> it=hset.iterator();
      while(it.hasNext())
         System.out.print(it.next() + " ");
      System.out.println();
        
      // without iterator
      for(Integer x: hset)
          System.out.print(x + " ");
      System.out.println();
      //hset.remove(null);
      // Converting a HashSet into an Array
      Integer[] array=new Integer[hset.size()];
      hset.toArray(array);
      for(Integer x: array)
          System.out.print(x + " ");
      System.out.println();
      
      // Converting a HashSet into an ArrayList
      List<Integer> alist= new ArrayList<Integer>(hset);
      for(Integer x: alist)
          System.out.print(x + " ");
      System.out.println();
      
      // Converting a HashSet into an TreeSet
      /*Set<Integer> tset=new TreeSet<Integer>(hset);
      // Displaying TreeSet elements
     System.out.println("TreeSet contains: ");
     for(Integer x: tset)
          System.out.print(x + " ");
      System.out.println("5."); */
      
      //Deleting all elements
      hset.clear();
    }
}
