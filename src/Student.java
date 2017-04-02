/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ranjan Kumar
 */

//Using Comparable we can sort only a single property which should be of an integer type. 
//In order to sort the ArrayList based on multiple properties we can use Comparator.
public class Student implements Comparable {
    private int sno;
    private String name;
    private int roll;
    public Student(int a,String s,int b){
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
    
    // Compare Function 
    public int compareTo(Object o) {
        if(!(o instanceof Student))
        throw new UnsupportedOperationException("Not supported yet."); 
        int newroll = ((Student) o).getroll();
        return this.roll-newroll;
         
        //for descending order
        // return newroll-this.roll
    }
 
    @Override
    public String toString() {
        return "[ serial number=" + sno + ", name=" + name + ", rollno=" + roll + "]";
    }

}


