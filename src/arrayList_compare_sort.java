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
public class arrayList_compare_sort {
    public static void main(String[] args){
        
        //Using compareTo
         ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(1, "Monika", 18));
	   arraylist.add(new Student(2, "Micky", 06));
	   arraylist.add(new Student(3, "Tamu", 94));

	   Collections.sort(arraylist);

	   for(Student str: arraylist){
			System.out.println(str);
	   }
           
          // Using Comparator
          ArrayList<Student_Comparator> monika = new ArrayList<Student_Comparator>();
	   monika.add(new Student_Comparator(1, "Monika", 18));
	   monika.add(new Student_Comparator(2, "Micky", 06));
	   monika.add(new Student_Comparator(3, "Tamu", 94));
           
            /*Sorting based on Student Name*/
	   System.out.println("Student Name Sorting:");
           Collections.sort(monika,Student_Comparator.stnamecomp);
           
          for(Student_Comparator str: monika){
			System.out.println(str);
	   }
          
           /*Sorting based on Roll Number*/
	   System.out.println("Student roll number Sorting:");
           Collections.sort(monika,Student_Comparator.rollcomp);
           
          for(Student_Comparator str: monika){
			System.out.println(str);
	   }
    }
}
