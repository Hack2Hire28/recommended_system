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
public class arraylist_example {
    public static void main(String[] args){
        //Creating  a ArrayList - A  dynamic array
        ArrayList<String> obj=new ArrayList<String>();
        
        //Adding elements
         obj.add("B");
	  obj.add("C");
	  obj.add("D");
	  obj.add("E");
	  obj.add("G");
          
          //Printing the whole list
          System.out.println("The current list is : " + obj);
          
          //adding element at a specific position
          obj.add(0,"A");
          obj.add(5,"F");
          
          //removing element by value
          obj.remove("G");
          
          // removing element by position
          obj.remove(5);
          
          //update element by position
          obj.set(4,"F");
          
          int i=obj.indexOf("A");
          
          System.out.println("The index of " + obj.get(0) + " is : " + i);
          
          //Size of list
          int l= obj.size();
          
          //Checking whether an element is present in list or not
          if(obj.contains("B"))
          System.out.println(obj.indexOf("B"));
          
          
          System.out.println("The current list is : " + obj);
          
          //Cearing the list
          obj.clear();
          
          //other ways of initialization
          ArrayList<String> language=new ArrayList<String>(Arrays.asList("C", "C++", "JAVA"));
          System.out.println("The current list is : " + language);
          
          //Another way of initialization
          ArrayList<String> newl=new ArrayList<String>(){{
                                     add("C");
                                     add("C++");
                                     add("JAVA");
                                     }};
          System.out.println("The new way: " + newl);
          
          //Collection.nCopies way
          ArrayList<Integer> no=new ArrayList<Integer>(Collections.nCopies(4,5)); //(count,element)
          System.out.println("The copies way: " + no);
          
          //addAll function 
          newl.addAll(language);
          System.out.println("After adding all from language to newl: "+ newl);
          
          //Adding newl in language at 3rd position(index =2)
           language.addAll(2, newl);
           
           // Sublist
           ArrayList<String> x=new ArrayList<String>(language.subList(0, 3));
           
          //ArrayList for looping
          ArrayList<Integer> alist=new ArrayList<Integer>();
          alist.add(1);
          alist.add(2);
          alist.add(3);
          alist.add(4);
          alist.add(5);
          
          //for loop
          System.out.println("For loop");
          for(int cnt=0;cnt<alist.size();++cnt)
          {
              System.out.print(alist.get(cnt)+ " ");
          }
          System.out.println();
          
          System.out.println("Advanced For Loop");
          //Advanced For Loop
          for(int j:alist)
              System.out.print(j + " ");
          System.out.println();
          
          //Iterator Loop
          System.out.println("Iterator Loop");
          Iterator it=alist.iterator();
          while(it.hasNext()){
              System.out.print(it.next() + " ");
          }
          System.out.println();
          
          // Enumiration
          System.out.println("Enumeration way to print");
          Enumeration<Integer> e = Collections.enumeration(alist);
          while(e.hasMoreElements()){
              System.out.print(e.nextElement() + " ");
          }
          
          //Sorting
          Collections.sort(alist);
          System.out.println();
          System.out.println("After sorting: " + alist);
          
          //Sorting in reverse order
          Collections.sort(alist,Collections.reverseOrder());
          System.out.println("After reverse sorting: " + alist);
    }
}
