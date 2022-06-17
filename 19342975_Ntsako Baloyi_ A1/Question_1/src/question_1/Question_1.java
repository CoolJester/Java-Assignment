package question_1;

import java.util.Scanner;
/**
 * @author Ntsako
 * student no. 19342975
 */
public class Question_1 {

    public static void main(String[] args) {
        
        //Running the Basic Program
        Details employee;
        employee =  setDetails();
        printDetails(employee);
        
        //The Deductions Section
        Scanner input2 = new Scanner(System.in);
        System.out.println("Would you like to see the increased salary with deductions? Enter 1 to view the deductions report or any other key to exit.");
        
        String prompt = input2.nextLine();
        
        switch (prompt){
            case "1":
                salaryDeductions(employee.getSalary());
                break;
        }
        
        System.out.println("Session Completed.");
        
    }
    
    //This method gets the needed information 
    public static Details setDetails(){
        
        //Creating the objects
        Details emp = new Details();
        Scanner input1 = new Scanner(System.in);
        
        //Getting the information from the user
        System.out.print("Enter Employee number >>");
        emp.setId(input1.nextInt());
        input1.nextLine();
        System.out.print("Enter Employee first name >>");
        emp.setFirstName(input1.nextLine());
        System.out.print("Enter Employee surname >>");
        emp.setSurname(input1.nextLine());
        System.out.print("Enter the Employee salary to be increased >>");
        emp.setSalary(input1.nextDouble());
        
        //returning the object with the stored values
        return emp;
    }
    
    //The Basic Information neeeded to be displayed
    public static void printDetails(Details d){
        
        String lineBreak = "****************************";
        
        System.out.print("EMPLOYEE DETAILS REPORT \n" + lineBreak + "\nEMPLOYEE NUMBER:\t"+ d.getId() +"\nEMPLOYEE FIRST NAME:\t" + d.getFirstName() +"\nEMPLOYEE SURNAME:\t" + d.getSurname() + "\nORIGINAL SALARY:\t" + d.getSalary() + "\nINCREASE SALARY:\t" + d.getUpdatedSalary() + "\nINCREASED AMOUNT:\t" + d.getIncreaseAmount() + "\n" + lineBreak +"\n");
        
    }
    
    //Additional Information by request of the user
    public static void salaryDeductions(double salary){
        
        String lineBreak = "****************************";
        double totalPay;
        //Deductions
        double tax;
        double medicalAid;
        double carAllowance;
        double uif;
        
        //Actual deductions
        tax = salary * 0.18;
        medicalAid = salary * 0.125;
        carAllowance = salary * 0.08;
        uif = salary * 0.02;
        
        //Take Home Pay
        totalPay = salary - tax - medicalAid - carAllowance - uif;
        
        //Displaying the information
        System.out.print("EMPLOYEE DEDUCTIONS REPORT \n" + lineBreak + "\nSALARY: \t"+ salary +"\nTAX: \t\t" + tax +"\nMEDICAL AID: \t" + medicalAid + "\nCAR ALLOWANCE: \t" + carAllowance + "\nUIF: \t\t" + uif + "\nTake Home Pay: \t" + totalPay + "\n" + lineBreak +"\n");
    }

    
}
