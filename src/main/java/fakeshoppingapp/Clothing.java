package fakeshoppingapp;

public class Clothing {
    private String description;
    private double price;
    private char size;



    public Clothing(String description, Double price, char size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
