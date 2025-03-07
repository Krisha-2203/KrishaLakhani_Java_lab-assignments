/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import javax.swing.ImageIcon;

/**
 *
 * @author krish
 */
public class Supplier {
    
    private String supplyName;
    private String description;
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    public Product getProductById(int id) {
        return productCatalog.searchProduct(id);  // Search for the product using ProductCatalog
    }
    
    @Override
    public String toString() {
        return supplyName;
    }
    
}
