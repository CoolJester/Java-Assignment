package question_3;

import javax.swing.JOptionPane;

public class Question_3 {

    public static void main(String[] args) {
        
        //Variable of the Delivary_Details data type
        Delivery_Details newDelivery;
        
        //Storing the data received from the user to the newDeliver variable
        newDelivery = getData();
        
        //Displaying the information to the console
        printDelivery(newDelivery);
        
    }
    
    //Getting the infromation from the user and saving it to the newDelivery Variable
    public static Delivery_Details getData(){
        
        Delivery_Details data = new Delivery_Details();
        
        data.setTown(JOptionPane.showInputDialog(null, "Selet the town the parcel will be delivered to \n1)Cape Town\n2)Pretoria\n3)Durban"));
        data.setWeight(JOptionPane.showInputDialog(null, "Selet the weight category to be delivery to "+ data.getTown() +"\n1)0kg - 4kg\n2)5kg - 9kg\n3)Over 10kg"));
        data.setDeliveryComp(JOptionPane.showInputDialog(null, "Select the courier company to delivery the parcel weight of " + data.getWeight() + " to " + data.getTown() + "\n1)ABC Couriers\n2)Fast Track\n3)Rest Assured"));
        
        return data;
    }
    
    public static void printDelivery(Delivery_Details dd){
        //Separator
        String lineBreak = "*********************************";
        
        //Setting the time
        time t = new time();
        t.setTime();        
        
        //printing the delivery report
        System.out.println("DELIVERY REPORT CREATED ON - " + t.getDate() + "\n"+ lineBreak +"\nTOWN:\t\t"+ dd.getTown() +"\nWEIGHT:\t\t"+ dd.getWeight() +"\nPRICE:\t\tR "+ dd.getPrice() +"\nVAT(14%)\tR "+ Math.floor(dd.getVat()) +"\nTOTAL DUE\tR "+ dd.getPriceDue() +"\nCOURIER\t\t"+ dd.getDeliveryComp() +"\n" + lineBreak);
    }
}
