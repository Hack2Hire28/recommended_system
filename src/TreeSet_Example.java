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
public class TreeSet_Example {
    public static void main(String[] args){
    Set<String> tset=new TreeSet<String>();
    tset.add("abc");
    tset.add("aaa");
    tset.add("bac");
    System.out.print("TreeSet Contains: " + tset);
    System.out.println();
    
    // TreeSet of Integer Type
         TreeSet<Integer> tset2 = new TreeSet<Integer>();

         // Adding elements to TreeSet<Integer>
         tset2.add(88);
         tset2.add(7);
         tset2.add(101);
         tset2.add(0);
         tset2.add(3);
         tset2.add(222);
         System.out.println(tset2);
    }
}
