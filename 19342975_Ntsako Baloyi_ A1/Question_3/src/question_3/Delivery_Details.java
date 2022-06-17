package question_3;


public class Delivery_Details {

    //Variable Declerations
    private String town;
    private String weight;
    private String deliveryComp;
    private double price;
    private double vat;
    private double priceDue;
    
    //The Setter Methods
    //Setting the town
    public void setTown(String str){
        switch (str){
            case "1":
                town = "Cape Town";
                break;
            case "2":
                town = "Pretoria";
                break;
            case "3":
                town = "Durban";
                break;
            default:
                town = "invalid location";
        }
    }
    //This method sets the weight and also the price, vat and priceDue
    public void setWeight(String str){
        switch(str){
            case "1":
                weight = "0kg - 4kg";
                price = 300;
                vat = price * 0.14;
                priceDue = price + vat;
                break;
            case "2":
                weight = "5kg - 9kg";
                price = 500;
                vat = price * 0.14;
                priceDue = price + vat;
                break;
            case "3":
                weight = "Over 10kg";
                price = 700;
                vat = price * 0.14;
                priceDue = price + vat;
                break;
            default:
                weight = "invalid weight";
                price = 0;
                vat = 0;
                priceDue = 0;
        }
    }
    //Setting the Delivery Company
    public void setDeliveryComp(String str){
        switch (str){
            case "1":
                deliveryComp = "ABC Couriers";
                break;
            case "2":
                deliveryComp = "Fast Track";
                break;
            case "3":
                deliveryComp = "Rest Assured";
                break;
            default:
                deliveryComp = "invalid courier company";
        }
    }
    
    
    //The Getter Methods
    public String getTown(){
        return town;
    }
    public String getWeight(){
        return weight;
    }
    public double getPrice(){
        return price;
    }
    public double getVat(){
        return vat;
    }
    public double getPriceDue(){
        return priceDue;
    }
    public String getDeliveryComp(){
        return deliveryComp;
    }
}