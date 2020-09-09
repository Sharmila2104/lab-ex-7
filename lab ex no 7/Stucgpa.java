/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucgpa;
import java.util.*;
class Student{  
int rollno;  
String name;  
float cgpa;  
Student(int rollno,String name,float cgpa){  
this.rollno=rollno;  
this.name=name;  
this.cgpa=cgpa;  
}  
} 

class CgpaComparator implements Comparator{  
@Override
public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
if(s1.cgpa==s2.cgpa)  
return 0;  
else if(s1.cgpa>s2.cgpa)  
return 1;  
else  
return -1;  
}  
}  
/**
 *
 * @author sharmila
 */
public class Stucgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  
ArrayList a=new ArrayList();  
a.add(new Student(90,"Saara", (float) 9.0));  
a.add(new Student(91,"Diya", (float) 9.8));  
a.add(new Student(92,"Priya", (float) 9.7)); 
a.add(new Student(93,"Hema", (float) 9.6));
a.add(new Student(94,"Pooja", (float) 9.0));  
a.add(new Student(95,"Vasanthi", (float) 9.8));  
a.add(new Student(96,"Varshini", (float) 9.7)); 
a.add(new Student(97,"Divya", (float) 9.6));
a.add(new Student(98,"Rani", (float) 9.0));  
a.add(new Student(99,"Sana", (float) 9.8));  
a.add(new Student(100,"Sri", (float) 9.7)); 
a.add(new Student(101,"Devi", (float) 9.6));
a.add(new Student(102,"Viji", (float) 9.0));  
a.add(new Student(103,"Rani", (float) 9.8));  
a.add(new Student(104,"Aarthi", (float) 9.7)); 
a.add(new Student(105,"Susi", (float) 9.6));
  

  
System.out.println("Sorting by CGPA");  
  
Collections.sort(a,new CgpaComparator());  
Iterator itr2=a.iterator();  
while(itr2.hasNext()){  
Student stu=(Student)itr2.next();  
System.out.println(stu.rollno+" "+stu.name+" "+stu.cgpa);  
}  
  
  
}  
}