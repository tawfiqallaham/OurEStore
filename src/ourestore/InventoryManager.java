/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourestore;

import java.util.ArrayList;

/**
 *
 * @author tawfi
 */
public class InventoryManager {
    private ArrayList<Product> products= new ArrayList<>();
    
    public void addproduct(Product product) {
        for(Product p : products){
            if(product.getName().equals(p.getName())){
                System.out.println("We alrady have this item in stock");
                return;
            }
        }
        products.add(product);
    }
}
