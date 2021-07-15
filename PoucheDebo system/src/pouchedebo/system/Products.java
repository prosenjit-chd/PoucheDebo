/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pouchedebo.system;

import java.util.Scanner;

/**
 *Products class is design products details.
 * @author Prosenjit 183-16-346
 */
public class Products {
    /**
     * 
     */
    private String ProductId;
    private String ProductNumber;
    private String ProductType;
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
      
    public String getProductId() {
        return ProductId;
    }

    public String getProductNumber() {
        return ProductNumber;
    }

    public String getProductType() {
        return ProductType;
    }

    public static Scanner getSc() {
        return sc;
    }
    public String ProductDescription() {
        return ProductDescription;
    }

    public String ProductItems() {
        return ProductItems;
    }
    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public void setProductNumber(String ProductNumber) {
        this.ProductNumber = ProductNumber;
    }

    public void setProductType(int ProductType) {
        this.ProductType = ProductType;
    }

    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }



    /**
     *
     */
    public void addProducts()
    {
          
    }
        public void editProducts()
    {
          
    }
            public void deleteProducts()
    {
          
    }
                public void searchProducts()
    {
          
    }
}
