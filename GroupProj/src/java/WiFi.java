/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class WiFi extends CarDecorator {
    Car car;
    
    public WiFi(Car car) {
        this.car = car;
    }
    
    @Override
    public String getDescription() {
        return car.getDescription() + ", WiFi";
    }
    
    public double getCost() {
        return car.getCost() + 3000;
    }
    
}
