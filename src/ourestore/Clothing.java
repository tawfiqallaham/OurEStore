/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourestore;

/**
 *
 * @author tawfi
 */
public class Clothing extends Product{
    private String brand;
    private SIZE size;
    private String color;
    private String fabricType;

    public Clothing(String brand, SIZE size, String color, String fabricType, String name, double price, int stockQuantity) {
        super(name, price, stockQuantity);
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.fabricType = fabricType;
    }
     
    
    enum SIZE{
        XS,S,M,L,XL,XXL;
    }
}
