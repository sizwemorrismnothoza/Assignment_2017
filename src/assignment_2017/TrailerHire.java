/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2017;

/**
 *
 * @author Reverside
 */
public class TrailerHire {
   
    private double amountDue;
    private double surcharge;
    private double amountPerKilometer;
    private double discount;
    
    private final double kiloMeters;
    private final double amount;
    private final double basicPrice = 300;
    private final double surchargeRate = 0.05; //5%
    private final double discountRate = 0.11; //11%

    public TrailerHire(String sKiloMeters,String sAmount){
        kiloMeters = Integer.parseInt(sKiloMeters);
        amount = Integer.parseInt(sAmount);
        if(kiloMeters<40){
            amountPerKilometer = kiloMeters*amount;
            surcharge = amountPerKilometer*surchargeRate;
            amountDue = (basicPrice+amountPerKilometer+surcharge);
        }
        else if(kiloMeters>200){
            amountPerKilometer = kiloMeters*amount;
            discount = amountPerKilometer*discountRate;
            amountDue = (basicPrice+amountPerKilometer-discount);
        }
    }

    /**
     * @return the amountDue
     */
    public double getAmountDue() {
        return amountDue;
    }

    /**
     * @return the surcharge
     */
    public double getSurcharge() {
        return surcharge;
    }

    /**
     * @return the amountPerKilometer
     */
    public double getAmountPerKilometer() {
        return amountPerKilometer;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @return the basicPrice
     */
    public double getBasicPrice() {
        return basicPrice;
    } 
}
