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
        
    }
    
    
    
    /*
    Di chuyen khap tree list de tim product can xoa dua tren ID, ap dung cac
    truong hop Node can xoa la: leaf node, has 1 childs, has 2 childs
    Truoc khi xoa can return product, neu khong tim thay product can xoa thi return null
    */
    public Product delete_product(int productID) {
        
        return null;
    }
    
    
    
    /*
    Di chuyen khap tree list de tim product dua tren ID
    */
    public Product search_product(int productID) {
        
        return null;
    }
    
    
    /*
    Cap nhat gia va so luong ton kho cua product, su dung productID
    de tim product trong tree list
    */
    public boolean update_product(int productID, double price, int quantityInStock) {
         // Tìm sản phẩm cần cập nhật
    Product productToUpdate = search_product(productID);
    
    // Nếu sản phẩm tồn tại thì cập nhật thông tin
    if (productToUpdate != null) {
        productToUpdate.price = price;
        productToUpdate.quantityInStock = quantityInStock;
        return true; // Cập nhật thành công
    }
    
    return false; // Không tìm thấy sản phẩm
    }
    
    

    //Su dung in-order Traversal de di khap tree list va in tung product co trong list
    public void display_products() {
         inOrderRec(root);
    }
    
    private void inOrderRec(Product root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println("ID Product: " + root.productID + ", Name: " + root.name);
            inOrderRec(root.right);
        }
    }
}
