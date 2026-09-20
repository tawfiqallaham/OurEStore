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
     public void removeProduct(int index){
         products.remove(index);
     
     }
    public int findProduct(String name){
        int n=products.size();
        for(int i=0;i<n;i++){
            if(name.equals(products.get(i).getName())){
                products.get(i).print();
                return i;
            }
        }
         System.out.println("Product not found");
         return -1;
    }    
    public int findProduct(int id){
        int n=products.size();
        for(int i=0;i<n;i++){
            if(products.get(i).getProductId()==id){
                products.get(i).print();
                return i;
            }
        }
         System.out.println("Product not found");
         return -1;
    }
    public void displayAllProduct(){
        for(Product p:products){
            p.print();
        }
    }
    public void displayAllProductOfOneType(String type){
        for(Product p:products){
            if(p.getClass().getSimpleName().equals(type))
            p.print();
        }
    }
}
