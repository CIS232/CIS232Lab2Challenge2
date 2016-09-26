
package lab02challenge2;

import java.util.Scanner;
public class Lab02Challenge2 {

    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the Shift Supervisor's name.");
        String Name = keyboard.nextLine();
        System.out.println("Enter the Shift Supervisor's Employee Number.");
        String employeeNumber = keyboard.nextLine();
        System.out.println("Enter the Shift Supervisor's Hire Date.");
        String hireDate = keyboard.nextLine();
        System.out.println("Enter the Shift Supervisor's Annual Salary.");
        String annualSalary = keyboard.nextLine();
        System.out.println("Enter the Shift Supervisor's Yearly Bonus.");
        String bonus = keyboard.nextLine();
        ShiftSupervisor sh = new ShiftSupervisor(Name, employeeNumber,hireDate,annualSalary,bonus); 
        keyboard.close();
        
        System.out.printf("The Shift Supervisor is %s and their Employee number is %s.\nTheir hire date was %s.\nThey have an annual salary of %,.2f and a yearly bonus of %,.2f \n", 
                sh.getEmployeeName(),sh.getEmployeeNumber(),sh.getHireDate(),sh.getAnnualSalary(),sh.getBonus());
    }
    
}