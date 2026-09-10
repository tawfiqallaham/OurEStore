/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourestore;

import java.util.Scanner;
import java.time.LocalDate;
import ourestore.Clothing.Size;


/**
 *
 * @author tawfi
 */
public class ConsolUI {
    public void registerProduct(InventoryManager manager){
        
        Scanner in=new Scanner(System.in);
        System.out.println("enter product name");
        String name="";
        do{
            while(name.trim().isEmpty())name=in.nextLine();
            try{
                Integer.parseInt(name);
                System.out.println("product name can't consist entirely of numbers try again");
                name=in.nextLine();
            }catch(Exception e){
                break;
            }
        }while(true);
        
        System.out.println("enter product price");
        double price;
        do{
            try{
                price=in.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("invalid input try again");
                in.nextLine();
            }
            
        }while(true);
        
        int stockQuantity;
        System.out.println("enter product stock quantity");
        do{
            try{
                stockQuantity=in.nextInt();
                break;
            }catch(Exception e){
                System.out.println("invalid input try again");
                in.nextLine();
            }
            
        }while(true);
        
        System.out.println("enter product type:(enter the index only)\n1-Grocery\n2-Electronics\n3-Clothing");
        int index;
        do{
            try{
                index=in.nextInt();
                if(index!=1&&index!=2&&index!=3){
                    throw new Exception();
                }
                break;
            }catch(Exception e){
                System.out.println("invalid input try again");
                in.nextLine();
            }
        }while(true);
        in.nextLine();
        switch(index){
            case 1:
                System.out.println("enter selling unit");
                String sellingUnit;
                sellingUnit=in.nextLine();
                
                boolean isGlutenFree;
                System.out.println("is it gluten free(yes/no)");
                do{
                    String temp=in.next();
                    if(temp.equalsIgnoreCase("yes")){
                        isGlutenFree=true;
                        break;
                    }
                    else if(temp.equalsIgnoreCase("no")){
                        isGlutenFree=false;
                        break;
                    }
                    else{
                        System.out.println("invalid input try again");
                    }
                    
                }while(true);
                
                boolean isRefrigerated;
                System.out.println("is it Refrigerated(yes/no)");
                do{
                    String temp=in.next();
                    if(temp.equalsIgnoreCase("yes")){
                        isRefrigerated=true;
                        break;
                    }
                    else if(temp.equalsIgnoreCase("no")){
                        isRefrigerated=false;
                        break;
                    }
                    else{
                        System.out.println("invalid input try again");
                    }
                    
                }while(true);
                
                int year,month,day;
                do{
                    try{
                        System.out.print("expration Date\nYear: ");
                       do{
                            try{
                                year=in.nextInt();
                                break;
                            }catch(Exception e){
                                System.out.println("invalid input try again");
                                in.nextLine();
                            }
                        }while(true);
                        System.out.print("Month: ");
                        do{
                            try{
                                month=in.nextInt();
                                break;
                            }catch(Exception e){
                                System.out.println("invalid input try again");
                                in.nextLine();
                            }
                        }while(true);
                        System.out.print("Day: ");
                        do{
                            try{
                                day=in.nextInt();
                                break;
                            }catch(Exception e){
                                System.out.println("invalid input try again");
                                in.nextLine();
                            }
                        }while(true);
                        if(!LocalDate.of(year, month, day).isAfter(LocalDate.now())){
                            System.out.println("expirated grocery is not allawed");              
                        }else
                        break;
                    }catch(Exception e){
                        System.out.println("invalid date try again");
                    }
                }while(true);
                
                manager.addproduct(new Grocery(sellingUnit, isGlutenFree, isRefrigerated, year, month, day, name, price, stockQuantity));
                break;
                
                
                
            case 2:
                System.out.println("enter brand's name");
                String brand="";
                do{
                   while(brand.trim().isEmpty())brand=in.nextLine();
                    try{
                        Integer.parseInt(brand);
                        System.out.println("brand's name can't consist entirely of numbers try again");
                        brand=in.nextLine();
                    }catch(Exception e){
                        break;
                    }
                }while(true);
                
                int powerConsumption;
                System.out.println("enter product power consumption");
                do{
                   try{
                        powerConsumption=in.nextInt();
                        break;
                    }catch(Exception e){
                        System.out.println("invalid input try again");
                        in.nextLine();
                    }
                }while(true);
                

                System.out.print("warranty period\nYears: ");
                do{
                    try{
                        year=in.nextInt();
                        if(year<0)System.out.println("can't enter negative years");
                        else break;
                    }catch(Exception e){
                        System.out.println("invalid input try again");
                        in.nextLine();
                    }
                }while(true);
                System.out.print("Months: ");
                do{
                    try{
                        month=in.nextInt();
                        if(month<0)System.out.println("can't enter negative months");
                        else break;
                    }catch(Exception e){
                        System.out.println("invalid input try again");
                        in.nextLine();
                    }
                }while(true);
                System.out.print("Days: ");
                do{
                    try{
                        day=in.nextInt();
                        if(day<0)System.out.println("can't enter negative days");
                        else break;
                    }catch(Exception e){
                        System.out.println("invalid input try again");
                        in.nextLine();
                    }
                }while(true);
                
                manager.addproduct(new Electronics(brand, powerConsumption, year, month, day, name, price, stockQuantity));
                break;
                
                
            case 3:
                System.out.println("enter brand's name");
                do{
                    brand="";while(brand.trim().isEmpty())brand=in.nextLine();
                    try{
                        Integer.parseInt(brand);
                        System.out.println("brand's name can't consist entirely of numbers try again");
                        brand=in.nextLine();
                    }catch(Exception e){
                        break;
                    }
                }while(true);
                
                Clothing.Size size=null;
                System.out.println("enter the size, valid sizes: XS,S,M,L,XL,XXL");
                while(size==null){
                    String temp=in.nextLine();
                    try{
                        size=Size.valueOf(temp.toUpperCase());
                    }catch(Exception e){
                        System.out.println("invalid size try again\nvalid sizes: XS,S,M,L,XL,XXL");
                    }
                }
                
                System.out.println("enter the color");
                String color="";
                do{
                    while(color.trim().isEmpty())color=in.nextLine();
                    try{
                        Integer.parseInt(color);
                        System.out.println("color's name can't consist entirely of numbers try again");
                    }catch(Exception e){
                        break;
                    }
                }while(true);
                
                System.out.println("enter the fabricType");
                String fabricType="";
                do{
                   while(fabricType.trim().isEmpty())fabricType=in.nextLine();
                    try{
                        Integer.parseInt(fabricType);
                        System.out.println("fabricType's name can't consist entirely of numbers try again");
                        fabricType=in.nextLine();
                    }catch(Exception e){
                        break;
                    }
                }while(true);
                
                manager.addproduct(new Clothing(brand, size, color, fabricType, name, price, stockQuantity));
                break;
                
        }
       
    }
}
