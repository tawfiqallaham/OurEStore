 
package ourestore;
 
public class Clothing extends Product{
    private String brand;
    private Size size;
    private String color;
    private String fabricType;

    public Clothing(String brand, Size size, String color, String fabricType, String name, double price, int stockQuantity) {
        super(name, price, stockQuantity);
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.fabricType = fabricType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }
    @Override
     public void print(){
         super.print();
         System.out.println("brand: " + brand + "\nsize: " + size + "\ncolor: " + color + "\nfabricType: " + fabricType );
     }

    @Override
    public String toString() {
        return "Clothing{" + + '}';
    }
    
    public enum Size{
        XS,S,M,L,XL,XXL;
    }
}
