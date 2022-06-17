package question_1;


public class Details {
    
    //Variable Declarations
    private int employeeId;
    private String firstName;
    private String surname;
    private double salary;
    private double salaryIncrease;
    private double increaseAmount;
    
    //The Setter Methods
    public void setId(int id){
        employeeId = id;
    }
    public void setFirstName(String name){
        firstName = name;
    }
    public void setSurname(String sn){
        surname = sn;
    }
    public void setSalary(double pay){
        salary = pay;
        increaseAmount = pay * 0.1;
    }
    
    //The Getter Methods
    public int getId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSurname(){
        return surname;
    }
    public double getSalary(){
        return salary;
    }
    public double getIncreaseAmount(){
        return increaseAmount;
    }
       
    //The Updated Salary
    public double getUpdatedSalary(){
        salaryIncrease = salary + increaseAmount;
        salary = salaryIncrease;
        return salaryIncrease;
    }
}
