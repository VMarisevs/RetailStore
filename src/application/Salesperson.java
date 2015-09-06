/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author Evilguy
 */
public class Salesperson extends Person {
    private int commissionPercent;
    private double perItemSold; //summary price that items was sold
    private double minimalWage;

    Salesperson(){
        commissionPercent = 0;
        perItemSold = 0;
        minimalWage = 0;
    }

    //get methods

    public int getCommissionPercent(){
        return commissionPercent;
    }

    public double getPerItemSold(){
        return perItemSold;
    }

    public double getMinimalWage(){
        return minimalWage;
    }

    public double getCommissionInEuro(){
        double commissionInEuro = getPerItemSold() * getCommissionPercent() / 100;
        return commissionInEuro;
    }

    public double getFullWage(){
        double fullWage = getCommissionInEuro() + getMinimalWage();
        return fullWage;
    }

    //set methods
    public void setCommissionPercent(String val){
        commissionPercent = Integer.parseInt(val);
    }

    public void setPerItemSold(String val){
        perItemSold = Double.parseDouble(val);
    }

    public void setMinimalWage(String val){
        minimalWage = Double.parseDouble(val);
    }


}
