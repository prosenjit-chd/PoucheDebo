/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pouchedebo.system;

import java.util.Scanner;

/**
 *Customer class is design customer details.
 * @author Prosenjit 183-16-346
 * @version 1.1.0
 */
public class Customer {
    /**
     * show method take two parameter and then show this
     * program Id is the first parameter for the method
     * program Role is the second parameter for the method
     * return is the show for two parameter
     */
    private String Id;
    private String Role;
    
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    
    
    public String getId() {
        return Id;
    }

    public String getRole() {
        return Role;
    }

    public static Scanner getSc() {
        return sc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }
      public void showInsertedInfo(Customer C)
    {
      
        System.out.println("\n********Your inserted informations******");
        System.out.println("ID Number: "+p.getId());
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Age: "+p.getAge());
        System.out.println("Mobile No: "+p.getPhoneNumber());
        System.out.println("Email: "+p.getEmail());
        System.out.println("Address: "+p.getAddress());
        System.out.println("User Name: "+p.getUsername());
        System.out.println("Password: "+p.getPassword());
        System.out.println("❤❤❤ Welcome ❤❤❤\n");
        
         
    }
    
    public void insertInfo()
    {
        Customer C = new Customer();
        
        System.out.println("Enter Id: ");
        this.id = sc2.nextInt();
        
        System.out.println("Enter Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter Age: ");
        this.age = sc2.nextInt();
        System.out.println("Enter Mobile Number: ");
        this.phoneNumber = sc.nextLine();     
        System.out.println("Enter Email: ");
        this.email = sc.nextLine();
        System.out.println("Enter Address: ");
        this.address = sc.nextLine();       
        
        C.setId(id);
        C.setName(name);
        C.setAge(age);
        C.setPhoneNumber(phoneNumber);
        C.setEmail(email);
        C.setAddress(address);
        C.setUsername(username);
        C.setPassword(password);
        this.showInsertedInfo(p);
    }
    
}
