/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erikmikac
 */

public class HeatedSeats extends CarDecorator{
    Car car;
	   public HeatedSeats(Car car) {
        this.car = car;
    }
    
    @Override
    public String getDescription() {
        return car.getDescription() + ", Heated Seats";
    }
    
    public double getCost() {
        return car.getCost() + 2500;
    }
	}




