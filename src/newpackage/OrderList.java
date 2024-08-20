/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class OrderList {
    static Date currentDate = new Date();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    static CustomerList customerList;
    static ProductList productList;
    public static class Order {
        //Attributes
        int orderID;
        int customerID;
        int productID;
        int quantityOrdered;
        String orderDate;
        Order next;

        //Constructors
        public Order() {
        }

        public Order(int orderID, int customerID, int productID, int quantityOrdered) {
            this.orderID = orderID;
            this.customerID = customerID;
            this.productID = productID;
            this.quantityOrdered = quantityOrdered;
            this.orderDate = dateFormat.format(currentDate);
            this.next = null;
        }

        //Getters and Setters

        public int getOrderID() {
            return orderID;
        }

        public void setOrderID(int orderID) {
            this.orderID = orderID;
        }

        public int getCustomerID() {
            return customerID;
        }

        public void setCustomerID(int customerID) {
            this.customerID = customerID;
        }

        public int getProductID() {
            return productID;
        }

        public void setProductID(int productID) {
            this.productID = productID;
        }

        public int getQuantityOrdered() {
            return quantityOrdered;
        }

        public void setQuantityOrdered(int quantityOrdered) {
            this.quantityOrdered = quantityOrdered;
        }

        public String getOrderDate() {
            return orderDate;
        }
        
        public Order getNext() {
            return next;
        }

        public void setNext(Order next) {
            this.next = next;
        }
        
        @Override
        public String toString() {
            return ("OrderID: " + orderID + "\nOrdered at: " + orderDate + "\nCustomer: " + customerList.search_customer(customerID).getName() + "\nProduct ordered: " + productList.search_product(productID).getName() + "\nQuantity ordered: " + quantityOrdered +"\n");
        }
    }
    
    
    
    //Head node
    Order head;
    int OrderID=3000;
    
    
    //Methods
    public void place_order(int customerID, int productID, int quantityOrdered) {
        Order newOrder = new Order(OrderID, customerID, productID, quantityOrdered);
        OrderID++;
        //insert new order to list
        if (head == null) {
            head = newOrder;
        } else {
            Order current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newOrder;
        }
        
        //reduce quantity of the ordered product
        productList.search_product(productID).setQuantityInStock(productList.search_product(productID).getQuantityInStock() - quantityOrdered);
    }
    
    
    
    public Order cancel_order(int orderID) {
        Order removedOrder = null;
        
        //Empty list
        if (head == null) {
            return null;
        }

        //is the only order in the list
        if (head.orderID == orderID) {
            removedOrder = head;
            head = head.next;
            return removedOrder;
        }

        
        Order current = head;
        while (current.next != null && current.next.orderID != orderID) {
            current = current.next;
        }
        
        if (current.next == null) {
            return null; 
        } else {  
            removedOrder = current.next;
            //return the quantity ordered
            productList.search_product(removedOrder.getProductID()).setQuantityInStock(productList.search_product(removedOrder.getProductID()).getQuantityInStock() + removedOrder.quantityOrdered);
            current.next = current.next.next;  
            return removedOrder;
        }   
    }
    
    
    
    public Order search_order(int orderID) {
        Order current = head;
        while (head != null) {
            if (current.orderID == orderID) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    
    
    public void display_orders_by_customer(int customerID) {
        
    }
    
    
    
    public void display_orders_by_product(int productID) {
        
    }
}
