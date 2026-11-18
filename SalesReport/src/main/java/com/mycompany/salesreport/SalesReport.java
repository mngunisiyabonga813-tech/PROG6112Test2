/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class SalesReport {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       //1D Array(ProductNAmes)
       String[] productNames = {
           "Cozy nights Monarch mattress",
           "Restonic Barbados mattress",
           "Sealy Phuket mattress"
       };
       
       //2D Array(Sales)
       int[][] sales = new int[3][3];
       
       //INPUT
       for (int i = 0; i < 3; i++){
           for (int month = 0; month < 3; month++) {
               System.out.print("Enter number of sales for month" + (month + 1) + "for" + productNames[i] + ":");
               sales[i][month] = input.nextInt();
           }
           System.out.println();
           }
       
           //Create Object
           Product product = new Product(productNames,sales);
      
        //OUTPUT 
        System.out.println("Product SAles Report");
        System.out.println();
        
        System.out.println("*****************************************************");
        System.out.println();
        System.out.println("TOTAL PRODUCT SALES:" + product.getTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES:" + product.getAverageProductsSold());
        System.out.println("MOST POPULAR PRODUCT: " + product.getMostPopularProduct);
    }
}