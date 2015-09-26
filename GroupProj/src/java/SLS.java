/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class SLS extends Car implements Bluetooth,Navigation {
    
    public SLS() {
        this.description = "SLS Mercedes with both Bluetooth and Navigation";
        this.cost = 90000;
    }
    
    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setDestination(String d) {
        System.out.println("Navigating to " + d + ".");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Connecting Bluetooth...");
    }
    
}
