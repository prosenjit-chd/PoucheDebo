/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pouchedebo.system;

/**
 * Productsdetails class is design for products calculation
 * @author Evan 183-16-364
 * @version 1.1.1.0
 */
public class Productsdetails {
    
    
    private int advance;
    /**
     * productAdvanceAmount method takes two numbers and return the Subtraction among them
     * @param advance is the first parameter of the method it means the advance amount that customer pay
     * @param due is the second parameter of the method it means the due amount that customer pay
     * @return 
     */
    public int productAdvanceAmount(int advance, int due){
        return advance - due;
    }
    
    private int discount;
    /**
     * productAdvanceAmount method takes two numbers and return the Subtraction among them
     * @param disCountAmount is the first parameter of the method it means the discount amount that customer get
     * @param actualAmount is the second parameter of the method it means the actual amount that customer pay
     * @return 
     */
    public int productDiscountAmount (int disCountAmount, int actualAmount){
        return actualAmount- disCountAmount;
    }

}
