/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Employee1;
import java.sql.*;
/**
 *
 * @author user
 */
public class EmployeeDao {
 
/**
 *
 * @author user
 */
   
    public static void save(Employee1 employee){
        String query = " insert into employee(id,name,email,mobileNumber,address,salary) values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getEmail()+"','"+employee.getMobileNumber()+"','"+employee.getAddress()+"','"+employee.getSalary()+"')";
        DbOperations.setDataOrDelete(query, "Employee Details Added Successfully");
    }
    public static ArrayList<Employee1> getAllRecords() {
        ArrayList<Employee1> arrayList = new ArrayList<>();
        try {
             ResultSet rs = DbOperations.getData("select * from  employee");
            while(rs.next()){
                Employee1 employee = new Employee1();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                 employee.setEmail(rs.getString("email"));
     employee.setMobileNumber(rs.getString("mobileNumber"));
     employee.setAddress(rs.getString("address"));
     employee.setSalary(rs.getString("salary"));
    
                arrayList.add(employee);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<Employee1> getAllRecords(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


