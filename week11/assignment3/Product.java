package week11.assignment3;

public class Product {
    private String name, description;
    private int units, productID;
    private double price;

    public Product()
    {
        
    }

    public Product(String name, String description, int units, double price)
    {
        this.name = name;
        this.description = description;
        this.units = units;
        this.price = price;
    }

    // setters
    public void setID(int id)
    {
        this.productID = id;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setDescription(String d)
    {
        this.description = d;
    }

    public void setUnitsAmount(int u)
    {
        this.units = u;
    }

    public void setPrice(double p)
    {
        this.price = p;
    }

    // getters
    public int getID()
    {
        return productID;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getUnits()
    {
        return units;
    }

    public double getPrice()
    {
        return price;
    }

    // toString method
    public String toString()
    {
        return "Product name: \t" + getName() + "\nDescription: \t" + getDescription() + "\nUnits on Hand: \t" + getUnits() + "\nPrice: \t" + getPrice();
    }

}
