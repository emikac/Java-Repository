/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erikmikac
 */
public class GPS extends CarDecorator {
    Car car;
       public GPS(Car car) {
        this.car = car;
    }
    
    @Override
    public String getDescription() {
        return car.getDescription() + ", GPS";
    }
    
    public double getCost() {
        return car.getCost() + 3500;
    }
    
}
