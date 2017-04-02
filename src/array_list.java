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
public class array_list {
    public static void main(String[] args){
    String[] s={"I", "You","He","She"};
    List<String> l=new ArrayList<String>();
    List<String> l1=new ArrayList<String>();
    l1.add("I");
    l1.add("He");
    for(String x: s)
    l.add(x);
    for(int i=0;i<l.size();++i)
    System.out.print(l.get(i) + " ");
    editlist(l,l1);
    System.out.println();
    for(int i=0;i<l.size();++i)
    System.out.print(l.get(i) + " ");
    }
    public static void editlist(Collection<String> l1,Collection<String> l2){
        Iterator it=l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next()))
                it.remove();
        }
    }
}
