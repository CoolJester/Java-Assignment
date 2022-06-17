package question_2;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 * @author Ntsako
 * student no.19342975
 */
public class Question_2 {

    public static void main(String[] args) {
        
        //The Genarator
        Random gen = new Random();
        
        /*
            Variables
        */        
        String lineBreak = "*******************************";
        
        //Storing the house colors in an array
        String[] houses = {"RED", "BLUE", "WHITE"};
        
        //Variables for student names
        String studentOneName;
        String studentTwoName;
        String studentThreeName;
        
        //Variables for student house allowcation
        String houseOne;
        String houseTwo;
        String houseThree;
        
        //Student ID's
        String studentOneId = "";
        String studentTwoId = "";
        String studentThreeId = "";
        
        //Full student allowacation strings
        String studentAllowcationOne;
        String studentAllowcationTwo;
        String studentAllowcationThree;
        
        //Prompting for the first student's name
        studentOneName = JOptionPane.showInputDialog("Enter the first student name");        
        //Generating a random ID
        for(int x = 0; x < 4; x++){
            //Variable used to store the random value
            int temp;
            //Getting a random value from the Random (ran) object
            temp = gen.nextInt(10);
            //Appending the temp value to the studentID
            studentOneId += temp;
        }
        //Generating a random house color for student one
        houseOne = houses[gen.nextInt(3)];
        //Storing the results in a varible
        studentAllowcationOne = studentOneName + " was asigned to the " + houseOne + " house with the student number " + houseOne + studentOneId;
        
        //Prompting for the second student's name
        studentTwoName = JOptionPane.showInputDialog("Enter the second student name");        
        //Generating a random ID
        for(int x = 0; x < 4; x++){
            //Variable used to store the random value
            int temp;
            //Getting a random value from the Random (ran) object
            temp = gen.nextInt(10);
            //Appending the temp value to the studentID
            studentTwoId += temp;
        }
        //Generating a random house color for student one
        houseTwo = houses[gen.nextInt(3)];
        //Storing the results in a varible
        studentAllowcationTwo = studentTwoName + " was asigned to the " + houseTwo + " house with the student number " + houseTwo + studentTwoId;
        
        //Prompting for the third student's name
        studentTwoName = JOptionPane.showInputDialog("Enter the third student name");        
        //Generating a random ID
        for(int x = 0; x < 4; x++){
            //Variable used to store the random value
            int temp;
            //Getting a random value from the Random (ran) object
            temp = gen.nextInt(10);
            //Appending the temp value to the studentID
            studentThreeId += temp;
        }
        //Generating a random house color for student one
        houseThree = houses[gen.nextInt(3)];
        //Storing the results in a varible
        studentAllowcationThree = studentTwoName + " was asigned to the " + houseThree + " house with the student number " + houseThree + studentThreeId;

        //Override feedback
        JOptionPane.showMessageDialog(null, "SCHOOL HOUSE ASSIGNMENT\n" + lineBreak + "\n" + studentAllowcationOne +"\n"+ studentAllowcationTwo + "\n"+ studentAllowcationThree, "School House Assignment", JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }
    
}
