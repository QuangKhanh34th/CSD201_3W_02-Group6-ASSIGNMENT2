/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package newpackage;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */

/*
NOTE: Neu can chay thu code trong ham main thi highlight cac doan khong can thiet va nhan [Ctrl + /]
*/
public class Main {
    public static void main(String args[]) throws IOException {
        //Database initialization
        CustomerList customerList = new CustomerList();
        ProductList productList = new ProductList();
        OrderList orderList = new OrderList();        
        Scanner sc = new Scanner(System.in);
        
       
        customerList.add_customer(1000, "Khanh", "abc@gmail.com", "070676766969", "Go Vap");
        customerList.add_customer(1001, "Vinh", "def@gmail.com","0987123456", "Yen Hoa");
        customerList.add_customer(1002, "Tien", "ghi@gmail.com","0978565467", "An Duong");
        customerList.add_customer(1003, "Phuc", "jkl@gmail.com","5678356467", "An Hoach");
        customerList.add_customer(1004, "Minh", "mno@gmail.com","3678960561", "Hoa Tan");
        OrderList.customerList = customerList;
        
        productList.insert_product(2000, "VivoBook X509JP", "Asus", 14990000, 5);
        productList.insert_product(2001, "MacBook Air 13", "Apple", 23390000, 500);
        productList.insert_product(2002, "Yoga Slim 7", "Levono", 30190000, 250);
        OrderList.productList = productList;




        
        //CustomerList's functions presentation
        int customerID;
        System.out.println("===Delete a customer===");
        System.out.print("Input customerID: ");
        customerID = sc.nextInt();
        System.out.println("Customer removed: " + customerList.remove_customer(customerID).name);
        OrderList.customerList = customerList;
        System.out.println("");
        
        
        sc = new Scanner(System.in);
        System.out.println("===Search for a customer===");
        System.out.print("Input customerID: ");
        customerID = sc.nextInt();
        System.out.println(customerList.search_customer(customerID).toString());
        System.out.println("");
        
        System.out.println("Press any key to continue (display customers)");
        System.in.read();
        System.out.println("===Display customers===");
        customerList.display_customers();
        System.out.println("");
        
        
        
        
        System.out.println("Press any key to continue (product list methods)");
        System.in.read();
        
        //ProductList's function presentation
        int productID;
        sc = new Scanner(System.in);
        System.out.println("===Delete a product===");
        System.out.print("Input productID: ");
        productID = sc.nextInt();
        System.out.println("\nRemoved product details\n" + productList.search_product(productList.root, productID));
        productList.delete_product(productList.root, productID);
        OrderList.productList = productList;
        System.out.println("");
        
        
        sc = new Scanner(System.in);
        System.out.println("===Search for a product===");
        System.out.print("Input productID: ");
        productID = sc.nextInt();
        System.out.println(productList.search_product(productList.root, productID).toString());
        System.out.println("");
        
        
        sc = new Scanner(System.in);
        System.out.println("===Update product===");
        System.out.print("Input productID: ");
        productID = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.print("Input new price: ");
        long price = sc.nextLong();
        sc = new Scanner(System.in);
        System.out.print("Input new quantity: ");
        int quantityInStock = sc.nextInt();
        productList.update_product(productID, price, quantityInStock);
        System.out.println("\nProduct's infos updated\n" + productList.search_product(productList.root, productID));
        OrderList.productList = productList;
        System.out.println("");
        
        
        
        System.out.println("Press any key to continue (display product)");
        System.in.read();
        System.out.println("===Display products===");
        productList.display_products();
        System.out.println("");
        
        
        
        System.out.println("Press any key to continue (order list methods)");
        System.in.read();
        
        //OrderList's functions presentation
        orderList.place_order(1000, 2000, 1);
        orderList.place_order(1000, 2002, 1);
        orderList.place_order(1000, 2002, 1);
        orderList.place_order(1001, 2000, 1);
        
        
        
        System.out.println("===Display orders===");
        orderList.displayAll();
        
        
        
        int orderID;
        sc = new Scanner(System.in);
        System.out.println("===Search order===");
        System.out.print("Input orderID: ");
        orderID = sc.nextInt();
        System.out.println(orderList.search_order(orderID));
        System.out.println("");
        
        
        
        sc = new Scanner(System.in);
        System.out.println("===Cancel order===");
        System.out.print("Input orderID: ");
        orderID = sc.nextInt();
        System.out.println("\nCanceled order details\n" + orderList.cancel_order(orderID));
        System.out.println("");
        
        
        
        sc = new Scanner(System.in);
        System.out.println("===Display order by Customer===");
        System.out.print("Enter customerID: ");
        customerID = sc.nextInt();
        orderList.display_orders_by_customer(customerID);
        
        
        
        sc = new Scanner(System.in);
        System.out.println("===Display orders by Product===");
        System.out.print("Enter productID: ");
        productID = sc.nextInt();
        orderList.display_orders_by_product(productID);
    }
}
