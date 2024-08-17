/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */

/*
NOTE: Neu can chay thu code trong ham main thi highlight cac doan khong can thiet va nhan [Ctrl + /]
*/
public class Main {
    public static void main(String args[]) {
        CustomerList customerList = new CustomerList();
        ProductList productList = new ProductList();
        OrderList orderList = new OrderList();
        Scanner sc = new Scanner(System.in);
        
        //CustomerList's functions presentation
        customerList.add_customer(1000, "Khanh", "070676766969", "Go Vap");
        customerList.add_customer(1001, "Vinh", "0987123456", "Yen Hoa");
        customerList.add_customer(1002, "Tien", "0978565467", "An Duong");
        customerList.add_customer(1003, "Phuc", "5678356467", "An Hoach");
        customerList.add_customer(1004, "Minh", "3678960561", "Hoa Tan");
        
        
        int customerID;
        System.out.println("===Delete a customer===");
        System.out.print("Input customerID: ");
        customerID = sc.nextInt();
        System.out.println("Customer removed: " + customerList.remove_customer(customerID).name);
        System.out.println("");
        
        
        sc = new Scanner(System.in);
        System.out.print("===Search for a customer===");
        System.out.print("Input customerID: ");
        customerID = sc.nextInt();
        System.out.println(customerList.search_customer(customerID).toString());
        System.out.println("");
        
        System.out.println("===Display customers===");
        customerList.display_customers();
        System.out.println("");
        
        
        
        
        
        //ProductList's function presentation
        productList.insert_product(2000, "VivoBook X509JP", "Asus", 14990000, 5);
        productList.insert_product(2001, "MacBook Air 13", "Apple", 23390000, 500);
        productList.insert_product(2002, "Yoga Slim 7", "Levono", 30190000, 250);
        
        
        int productID;
        sc = new Scanner(System.in);
        System.out.println("===Delete a product===");
        System.out.print("Input productID: ");
        productID = sc.nextInt();
        System.out.println("Product removed: " + productList.delete_product(productID).name);
        System.out.println("");
        
        
        sc = new Scanner(System.in);
        System.out.println("===Search for a product===");
        System.out.print("Input productID: ");
        productID = sc.nextInt();
        System.out.println(productList.search_product(productID).toString());
        System.out.println("");
        
        
        sc = new Scanner(System.in);
        System.out.println("===Update product===");
        System.out.print("Input productID: ");
        productID = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.print("Input new price: ");
        double price = sc.nextDouble();
        sc = new Scanner(System.in);
        System.out.print("Input new quantity: ");
        int quantityInStock = sc.nextInt();
        productList.update_product(productID, price, quantityInStock);
        System.out.println("Product's infos updated: " + productList.search_product(productID).toString());
        System.out.println("");
        
        System.out.println("===Display products===");
        productList.display_products();
        System.out.println("");
        
        
        
        
        
         
        //OrderList's functions presentation
        
    }
}
