/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public abstract class MercedesBenz {
    
    public Car orderCar(String type) {
        Car car;
        
        car = makeCar(type);
        
        return car;
    }
    
    abstract Car makeCar(String type);
    
    
}
