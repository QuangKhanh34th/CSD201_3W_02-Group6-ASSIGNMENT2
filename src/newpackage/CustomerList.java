/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ASUS
 */
public class CustomerList {
    public static class Customer {
        //Attributes
        int customerID;
        String name;
        String phoneNumber;
        String address;
        CustomerList next;

        //Constructors
        public Customer() {
        }

        public Customer(int customerID, String name, String phoneNumber, String address) {
            this.customerID = customerID;
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.next = null;
        }
        
        //Getters and Setters
        public int getCustomerID() {
            return customerID;
        }

        public void setCustomerID(int customerID) {
            this.customerID = customerID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public CustomerList getNext() {
            return next;
        }

        public void setNext(CustomerList next) {
            this.next = next;
        }
        
        //display information method
        @Override
        public String toString() {
            return ("CustomerID: " + customerID + "\nName: " + name + "\nPhone Number: " + phoneNumber + "\nAddress: " + address);
        }     
    }
    //head node
    private Customer head;
    
    //List's Methods
    
    /*
    Them Customer va dat pointer head = customer neu danh sach dang trong,
    khong trong thi dat customer vua tao vao pointer next cua customer tao 
    truoc do
    */
    public void add_customer(int customerID, String name, String phoneNumber, String address) {
        
    }
    
    
    
    /*
    duyet tim customer can xoa bang ID, return customer bi xoa sau do
    xoa customer, sau khi xoa update lai pointer head va next
    cua customer phia sau customer da bi xoa. Neu khong tim thay customer
    can xoa thi return null
    */
    public Customer remove_customer(int customerID) {
        return null;
    }
    
    
    
    /*
    duyet tim customer bang ID, tim thay thi return customer, khong thi null
    */
    public Customer search_customer(int customerID) {
        
        return null;
    }
    
    
    
    /*
    display thong tin cua TAT CA customer co trong list dung ham toString,
    da khai bao trong class Customer
    */
    public void display_customers() {
        
    }    
    
}
