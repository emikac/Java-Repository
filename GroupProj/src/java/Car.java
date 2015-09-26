/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public abstract class Car implements Navigation, Bluetooth {
    String description;
    double cost;
    
    abstract double getCost();
    
    public String getDescription() {
        return description;
    }
    
    public void addTax(double tax) {
        cost = cost + tax;
    }
    
    @Override
    public void connectBluetooth() {
        System.out.println("Connecting Bluetooth...");
    }
    
    public void installHeatedSeats(){
        System.out.println("Installing Heated Seats...");
    }
    
    @Override
    public void setDestination(String d) {
        System.out.println("Navigating to " + d + "...");
    }
}
