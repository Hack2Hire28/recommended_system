/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ranjan Kumar
 */
public class string {
    public static void main(String[] args){
        String[] name= {"Mamta", "Anju", "Moni", "Minakshi", "Dolly"};
        for(String a : name)
            System.out.print(a + " ");
        System.out.println('\n' + name[0]);
        for(String x : name){
            if(x.startsWith("M"))
                System.out.print(x + " ");
        }
        
    }
}
