package newpackage;

/**
 *
 * @author ASUS
 */
public class CustomerList {
    public static class Customer {
        // Attributes
        int customerID;
        String name;
        String email;
        String phoneNumber;
        String address;
        Customer next;

        // Constructors
        public Customer() {
        }

        public Customer(int customerID, String name, String email, String phoneNumber, String address) {
            this.customerID = customerID;
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.next = null;
        }

        // Getters and Setters
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
        
        public String getEmail() {
            return email;
        }
        
        public void setEmail(String email) {
            this.email = email;
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

        public Customer getNext() {
            return next;
        }

        public void setNext(Customer next) {
            this.next = next;
        }

        // Display information method
        @Override
        public String toString() {
            return "CustomerID: " + customerID + "\nName: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNumber + "\nAddress: " + address;
        }
    }

    // Head node
    private Customer head;

    // Add a customer to the list
    public void add_customer(int customerID, String name, String email, String phoneNumber, String address) {
        Customer newCustomer = new Customer(customerID, name, email, phoneNumber, address);
        if (head == null) {
            head = newCustomer;
        } else {
            Customer current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newCustomer;
        }
    }

    // Remove a customer by ID and return the removed customer
    public Customer remove_customer(int customerID) {
        if (head == null) {
            return null; // List is empty
        }

        if (head.customerID == customerID) {
            Customer removedCustomer = head;
            head = head.next;
            return removedCustomer;
        }

        Customer current = head;
        while (current.next != null && current.next.customerID != customerID) {
            current = current.next;
        }

        if (current.next == null) {
            return null; // Customer not found
        }

        Customer removedCustomer = current.next;
        current.next = current.next.next;
        return removedCustomer;
    }

    // Search for a customer by ID
    public Customer search_customer(int customerID) {
        Customer current = head;
        while (current != null) {
            if (current.customerID == customerID) {
                return current;
            }
            current = current.next;
        }
        return null; // Customer not found
    }

    // Display information for all customers in the list
    public void display_customers() {
        Customer current = head;
        while (current != null) {
            System.out.println(current);
            System.out.println("");
            current = current.next;
        }
    }
    }
