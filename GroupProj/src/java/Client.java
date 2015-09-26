/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Client {
    public static void main(String args[]) {
        MercedesChicago merc = new MercedesChicago();
        
        Car car = merc.orderCar("sls");
        System.out.println(car.getDescription());
        System.out.println(car.getCost());
        car.setDestination("bloomington");
        car = new WiFi(car);
        System.out.println(car.getDescription());
        System.out.println(car.getCost());
        
    }
}
