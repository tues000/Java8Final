package school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Calculator {
    
    public static void main(String[] args) {
    
        System.out.println("Enter student number: ");
        
        //wait for input
        Scanner scanner = new Scanner(System.in);
        int numberOfStudent = scanner.nextInt();
        
        HashMap<String, Student> studentMap = new HashMap();
        
        for( int i=0; i < numberOfStudent; i++) {
          Student student = new Student();
          System.out.println("Enter student name?:");
          String studentName = new Scanner(System.in).nextLine();
          student.setName(studentName);
          Set<String> keys = student.gpa.subjectGpa.keySet();
          
                      XX:
  for (String subjName : keys) {
                System.out.println("Enter GPA for subject " + subjName);              
                int gpa = new Scanner(System.in).nextInt();                
                //if(gpa.indexOf(".") < -1){
                    
                
               if(gpa == 0 || gpa == 1 || gpa == 2|| gpa == 3|| gpa == 4){
                   continue XX;
                                
                }
                student.gpa.subjectGpa.put(subjName, gpa);
            }             
          studentMap.put(student.name, student);
        }      
               
        for(;;) {
            System.out.println("Enter student name for GPA:?");
            String nameGPA = new Scanner(System.in).nextLine();
            if(nameGPA.equals("0")) {
                break;
            }
            
            Student student = studentMap.get(nameGPA);
            if(student !=null) {
                System.out.println("Name:" +   student.name + " get " + student.gpa.getGpa());
            }else {
                System.out.println("Not found");
            }
        }
    }
}
