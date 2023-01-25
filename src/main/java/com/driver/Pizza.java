package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese ;
    private int toppings;
    //private int basePrize;

    boolean isExtraCheeseAdded ;
    boolean isExtraToppingsAdded ;
    boolean isTakeAwayAdded ;
    boolean isBillGenerated ;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBillGenerated = false ;
        this.isExtraCheeseAdded = false ;
        this.isExtraToppingsAdded = false ;
        this.isTakeAwayAdded = false ;
        this.bill=" ";
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill +="Base price of the Pizza :"+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){


        return this.price;
    }

    public void addExtraCheese(){
       if(!isExtraCheeseAdded){
           this.price = this.price + cheese ;
           this.isExtraCheeseAdded = true ;
       }
        // your code goes here
    }

    public void addExtraToppings(){


        if(!isExtraToppingsAdded){
            this.price = this.price + toppings ;
            this.isExtraToppingsAdded = true ;
        }// your code goes here
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            this.price += 20 ;
            isTakeAwayAdded = true ;
        }
        // your code goes here
    }

    public String getBill(){
        if(!isBillGenerated) {
            if(isExtraCheeseAdded)
            this.bill += "Extra cheese Added :" + this.cheese + "\n";
            if (isExtraToppingsAdded)
                this.bill += "Extra Toppings Added :" + this.toppings + "\n";
            if (isTakeAwayAdded)
                this.bill += "Paperbag  Added :" + "20" + "\n";

            this.bill += "Total price :"+this.price+"\n" ;
            isBillGenerated = true ;
        }// your code goes here
        return this.bill;
    }
}
