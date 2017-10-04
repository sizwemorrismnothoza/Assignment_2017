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
public class PayCalculator {
    private double ratePerHour;
    
    private final double hours;
            
    public PayCalculator(String sHours, String sRatePerHour){
        hours = Integer.parseInt(sHours);
        ratePerHour = Integer.parseInt(sRatePerHour);
        
        if(hours == 40 && ratePerHour < 28.5){
            ratePerHour = ratePerHour + 1.5;
        }else if(hours >40 && ratePerHour>=28.5){
            ratePerHour = ratePerHour + (ratePerHour*0.015);
        }else if(hours<40){
            ratePerHour = ratePerHour - 0.5;   
        }else if(hours == 40 && ratePerHour>=28.5 ){
            ratePerHour = ratePerHour + 1.2;
        }   
    }
}
