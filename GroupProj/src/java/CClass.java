/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class CClass extends Car {
    
    public CClass() {
        this.description = "C-Class Mercedes for those on a budget.";
        this.cost = 30000;
    }
    
    @Override
    public double getCost() {
        return cost;
    }
}
