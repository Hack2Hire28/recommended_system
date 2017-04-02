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
public class Student_Comparator {
    private int sno;
    private String name;
    private int roll;
    public Student_Comparator(int a,String s,int b){
        this.sno=a;
        this.name=s;
        this.roll=b;
    }
    public int getsno()
    {
        return sno;
    }
    public void setsno(int a){
        this.sno=a;
    }
    public String getname(){
        return name;
    }
    public void setname(String s){
        this.name=s;
    }
    public int getroll(){
        return roll;
    }
    public void setroll(int r)
    {
        this.roll=r;
    }
    
    // Comparator for sorting the list by Student Name
    public static Comparator<Student_Comparator> stnamecomp=new Comparator<Student_Comparator>(){
        public int compare(Student_Comparator o1, Student_Comparator o2) {
            if(!(o1 instanceof Student_Comparator) || !(o2 instanceof Student_Comparator))
            throw new UnsupportedOperationException("Not supported yet."); 
            String s1=o1.getname().toLowerCase();
            String s2=o2.getname().toLowerCase();
            
            //Ascending order
            return s1.compareTo(s2);
            
            //For Descending Order
            // return s2.compareTo(s1);
        }
        
    };
    
    public static Comparator<Student_Comparator> rollcomp=new Comparator<Student_Comparator>(){
        public int compare(Student_Comparator o1, Student_Comparator o2) {
            if(!(o1 instanceof Student_Comparator) || !(o2 instanceof Student_Comparator))
            throw new UnsupportedOperationException("Not supported yet."); 
           int r1=o1.getroll();
           int r2=o2.getroll();
            
            //Ascending order
            return r1-r2;
            
            //For Descending Order
            // return r2-r1;
        }
        
    };
    
    @Override
    public String toString() {
        return "[ serial number=" + sno + ", name=" + name + ", rollno=" + roll + "]";
    }
}
