package Utilities;

public class Product implements Comparable<Product>{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public int compareTo(Product product) {
        if (price == product.price)
            return 0;
        else if (price > product.price)
            return 1;
        else
            return -1;
    }
    @Override
    public boolean equals(Object other){
        if (!(other instanceof Product))
            return false;
        else
        {
            Product tmp = (Product) other;
            return (name.equals(tmp.name) && price == tmp.price );
        }
    }
    @Override
    public String toString(){
        return "Name: " + name + " Price: " + price;
    }
}
