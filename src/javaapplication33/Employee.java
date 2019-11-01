/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author George.Pasparakis
 */
public class Employee implements Human {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Employee();
        Employee employee = new Employee();
        
        System.out.println(Human.NAME);
    }
    
    @Override
    public void eat() { 
        System.out.println("Eating"); 
    }
    
    @Override
    public void running() {
            System.out.println("Running!");
    }
    
    public void sleeping() {
        System.out.println("Sleeping!");
    }
}


