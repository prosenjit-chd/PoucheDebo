/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pouchedebo.system;

/**
 *Customer class is design customer details.
 * @author Prosenjit183-16-346
 * @version 1.1.0
 */
public class customerc {
    
 
    public int show(int firstInstallment, int secondInstallment){
        int finalInstallment = firstInstallment+secondInstallment;
        return finalInstallment;
    }
    
    public int calculate(int preOrder, int postOrder){
        int cal = postOrder-preOrder;
        return cal;
    }
}
