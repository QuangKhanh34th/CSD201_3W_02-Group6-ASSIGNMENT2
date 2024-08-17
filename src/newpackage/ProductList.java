/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ASUS
 */
public class ProductList {
    public static class Product {
        //Attributes
        int productID;
        String name;
        String brand;
        double price;
        int quantityInStock;
        Product left;
        Product right;

        //Constructors
        public Product() {
        }


        public Product(int productID, String name, String brand, double price, int quantityInStock) {
            this.productID = productID;
            this.name = name;
            this.brand = brand;
            this.price = price;
            this.quantityInStock = quantityInStock;
            this.left = null;
            this.right = null;
        }

        //Getters and Setters   
        public int getProductID() {
            return productID;
        }

        public void setProductID(int productID) {
            this.productID = productID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantityInStock() {
            return quantityInStock;
        }

        public void setQuantityInStock(int quantityInStock) {
            this.quantityInStock = quantityInStock;
        }

        public Product getLeft() {
            return left;
        }

        public void setLeft(Product left) {
            this.left = left;
        }

        public Product getRight() {
            return right;
        }

        public void setRight(Product right) {
            this.right = right;
        }
    }
    
    //Root node
    Product root;
    
    //List's Methods
    /*
    Them product, lay productID de lam du lieu chinh trong viec xep cay
    */
    public void insert_product(int productID, String name, String brand, double price, int quantityInStock) {
        Product newProduct = new Product(productID, name, brand, price, quantityInStock);
        
        if (root == null) {
            root = newProduct;
            return;
        }
        
        Product current = root;
        Product parent = null;
        
        while (true) {            
            parent = current;
            
            if (productID < current.getProductID()) {
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(newProduct);
                    return;
                }
            } else {
                current = current.getRight();
                if (current == null) {
                    parent.setRight(newProduct);
                    return;
                }
            }
        }
    }
    
    
    
    /*
    Di chuyen khap tree list de tim product can xoa dua tren ID, ap dung cac
    truong hop Node can xoa la: leaf node, has 1 childs, has 2 childs
    Truoc khi xoa can return product, neu khong tim thay product can xoa thi return null
    */
    public Product delete_product(Product root, int productID) {
        if (this.root == null) {
            return this.root;
        }
        
        if (productID < this.root.getProductID()) {
            this.root.setLeft(delete_product(this.root.getLeft(), productID));
        } else if (productID > this.root.getProductID()) {
            this.root.setRight(delete_product(this.root.getRight(), productID));
        } else {
            if (this.root.getLeft() == null) {
                return this.root.getRight();
            } else if (this.root.getRight() == null) {
                return this.root.getLeft();
            }
            this.root.setRight(minValue(this.root.getRight()));
            this.root.setRight(delete_product(this.root.getRight(), this.root.getProductID()));
        }
        return root;
    }
    
    private int minValue(Product root){
        int min = this.root.getProductID();
        while (this.root.getLeft() != null) {            
            min = this.root.getLeft().getProductID();
            this.root = this.root.getLeft();
        }
        return min;
    }
    
    
    
    /*
    Di chuyen khap tree list de tim product dua tren ID
    */
    public Product search_product(Product root, int productID) {
        if (this.root == null || this.root.getProductID() == productID) {
            return root;
        }
        
        if (root.getProductID() > productID) {
            return search_product(root.getLeft(), productID);
        }
        return search_product(root.getRight(), productID);
    }
    
    
    /*
    Cap nhat gia va so luong ton kho cua product, su dung productID
    de tim product trong tree list
    */
    public void update_product(int productID, double price, int quantityInStock) {
        
    }
    
    

    //Su dung in-order Traversal de di khap tree list va in tung product co trong list
    public void display_products() {
        
    }
}
