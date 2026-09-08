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
public abstract class Product {
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;
    private static int idGenerator=1;

    public Product(){}
    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.productId=idGenerator;
        idGenerator++;
    }
    
    
}
