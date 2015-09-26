/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class MercedesNewYork extends MercedesBenz {
    
    @Override
    public Car makeCar(String type) {
        Car car;
        
        if (type.equalsIgnoreCase("C-Class")) {
            car = new CClass();
            //addTax(double);
            return car;
        } else if (type.equalsIgnoreCase("SL-Class")) {
            car = new SLClass();
            //addTax(double);
            return car;
        } else if (type.equalsIgnoreCase("SLS")){
            car = new SLS();
            //addTax(double);
            return car;
        } else {
            return null;
        }
    }
}
