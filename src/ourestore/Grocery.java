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
public class Grocery extends Product{
    private String sellingUnit;
    private boolean isGlutenFree;
    private boolean isRefrigerated;
    private LocalDate expirationDate;

    public Grocery(String sellingUnit, boolean isGlutenFree, boolean isRefrigerated,int year,int month,int day, String name, double price, int stockQuantity) {
        super(name, price, stockQuantity);
        this.sellingUnit = sellingUnit;
        this.isGlutenFree = isGlutenFree;
        this.isRefrigerated = isRefrigerated;
        this.expirationDate = LocalDate.of(year, month, day);
    }

    public String getSellingUnit() {
        return sellingUnit;
    }

    public void setSellingUnit(String sellingUnit) {
        this.sellingUnit = sellingUnit;
    }

    public boolean isIsGlutenFree() {
        return isGlutenFree;
    }

    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    public boolean isIsRefrigerated() {
        return isRefrigerated;
    }

    public void setIsRefrigerated(boolean isRefrigerated) {
        this.isRefrigerated = isRefrigerated;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    

    
}
