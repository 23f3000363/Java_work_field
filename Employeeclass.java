//Let me tell you about this code, it contain use of construtor and kinda demonstrate how can we use classes in a java program.
//Basically what this Program do is take input of Employee's name, dept and id and Demonstrate two key factor how can be copy data from other object and how can we display that.
//Like in the main we displayed only e1 in which we copied the Department details of e2 which we took input from the user.
import java.util.Scanner;
class Employee{
    String ename,eid,edept;
    public Employee(){
        ename="GUEST";
    }
    // Define the required method
    Employee(String name,String id,String dept){
        ename=name;
        eid=id;
        edept=dept;
    }
    public void copyDept(Employee obj){
        edept=obj.edept;
    }
    public void displayDetails(){
        System.out.println("ename :" + ename);
        System.out.println("eid :" + eid);
        System.out.println("edept :" + edept);
    }
}
public class Employeeclass{
    public static void main(String args[]){
        try(Scanner s = new Scanner(System.in);){
            Employee e1 = new Employee();
            //Enter the name of the Employee
            String name = s.nextLine();
            //Enter the id of the Employee
            String id = s.nextLine();
            //Enter the Department of the Employee
            String dept = s.nextLine();
            Employee e2 = new Employee(name, id, dept);
            e1.copyDept(e2);
            //Copies the department name of e2 into e1's department name.
            e1.displayDetails();
        }
    }
}