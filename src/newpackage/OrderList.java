/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class OrderList {
    public static class Order {
        //Attributes
        int orderID;
        int customerID;
        int productID;
        int quantityOrdered;
        Date orderDate;
        Order next;

        //Constructors
        public Order() {
        }

        public Order(int orderID, int customerID, int productID, int quantityOrdered, Date orderDate) {
            this.orderID = orderID;
            this.customerID = customerID;
            this.productID = productID;
            this.quantityOrdered = quantityOrdered;
            this.orderDate = orderDate;
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

        public Date getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
        }

        public Order getNext() {
            return next;
        }

        public void setNext(Order next) {
            this.next = next;
        }
    }
    
    
    
    //Head node
    Order head;
    
    
    
    //Methods
    public void place_order(int productID, int customerID) {
        
    }
    
    
    
    public void cancel_order(int orderID) {
        
    }
    
    
    
    public Order search_order(int orderID) {
        
        return null;
    }
    
    
    
    public void display_orders_by_customer(int customerID) {
        
    }
    
    
    
    public void display_orders_by_product(int productID) {
        
    }
}
