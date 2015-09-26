/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class SLClass extends Car implements Bluetooth {
    
    public SLClass() {
        this.description = "SL-Class Mercedes with Bluetooth";
        this.cost = 60000;
    }
    
    @Override
    public double getCost() {
        return cost;
    }
}
