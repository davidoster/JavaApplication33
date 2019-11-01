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
public abstract interface Human {
   String NAME = "HUMAN";
   
   default void eat() {};
   
   abstract public void running();
   
    
}
