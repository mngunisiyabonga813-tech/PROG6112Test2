/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class Product implements IProducts {
    
    private String[] productNames;
    int[][] sales;
    
    public Product(String[] productNames,int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }
    
    public int getTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total = total + sales[i][j];
            }
        }
        return total;
    }
     public double getAverageProductsSold() {
         int total = getTotalProductsSold();
         return (double) total / 9;
     }
     public String getMostPopularProduct(){
         int[] productTotal = new int[3];
         
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++)
                 productTotal[i] = productTotal[i] + sales[i][j];
         }
     }
         int highest = productTotal[0];
         int index = 0;
         
         for (int i = 1; i < 3; i++) {
            if (productTotal[i] > highest) {
                 highest = productTotal[i];
                 index = i ;
            }
        }
         
         return productNames[index] + " (" + highest + ")";
     }        

    @Override
    public String getMostPopularProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
