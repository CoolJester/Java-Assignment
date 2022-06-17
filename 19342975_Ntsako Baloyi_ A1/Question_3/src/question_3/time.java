package question_3;

import java.util.Date;
import java.time.LocalDate;

public class time {
    
    //Our time Variables 
    private int hour;  
    private int minute;  
    private int second;  
    LocalDate theDay = LocalDate.now();

    
    
    public void setTime(){
        
        //The Date Object
        Date d = new Date();
        
        //Assigning the current date and time
        hour = d.getHours();
        minute = d.getMinutes();
        second = d.getSeconds();
    }
    
    public String getDate(){
        return String.format("%s %02d:%02d:%02d", theDay, hour, minute, second);
    }
}
