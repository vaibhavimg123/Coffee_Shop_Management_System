/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class tables {
    public static void main(String args[]){
        try{
       String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),status varchar(20))";  
       String adminTable = "create table admin(name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),status varchar(20))";  

       String adminDetails = "insert into  user(name ,email,mobileNumber ,address,password,status) values('Admin','admin@gmail.com','1234575980','India','admin','true' )";  
       String categoryTable = " create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
        String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
       String billTable = " create table bill(id int  primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(200),total varchar(200),createdBy varchar(200))";
        String employeeTable = "create table employee(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),salary varchar(200))";  
      DbOperations.setDataOrDelete(employeeTable, "Employee Details Added Successfully");
        
     DbOperations.setDataOrDelete(adminTable, "Admin Table Created Successfully");
      DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");

        DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
       DbOperations.setDataOrDelete(categoryTable, "category Table Created Successfully");
        DbOperations.setDataOrDelete(productTable, "product Table Created Successfully");
        DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");
   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
