/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourestore;

import java.time.LocalDate;
/**
 *
 * @author tawfi
 */
public class Electronics extends Product{
    private String brand;
    private int powerConsumption;
    private LocalDate warrantyPeriod;

    public Electronics(String brand, int powerConsumption,int year,int month,int day, String name, double price, int stockQuantity) {
        super(name, price, stockQuantity);
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.warrantyPeriod = LocalDate.of(year,month,day);
    } 
    
}
