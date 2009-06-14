package com.kiloan.item;

/**
 * Prototype objects for products that is to be bidded
 *
 * @author Tata
 */
public class Product implements Comparable {

    public Product(String id, String name, String description, float price, String pictureURI, String dateAdded) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.pictureURI = pictureURI;
        this.dateAdded = dateAdded;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureURI() {
        return pictureURI;
    }

    public void setPictureURI(String pictureURI) {
        this.pictureURI = pictureURI;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    private String id;
    private String name;
    private String description;
    private float price;
    private String pictureURI;
    private String dateAdded;

    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
