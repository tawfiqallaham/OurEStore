/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourestore;

import java.time.Period;
/**
 *
 * @author tawfi
 */
public class Electronics extends Product{
    private String brand;
    private int powerConsumption;
    private Period warrantyPeriod;

    public Electronics(String brand, int powerConsumption,int year,int month,int day, String name, double price, int stockQuantity) {
        super(name, price, stockQuantity);
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.warrantyPeriod = Period.of(year,month,day);
    } 

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Period getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(Period warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    
}
