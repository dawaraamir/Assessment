package fakeshoppingapp;

import java.util.Arrays;

public abstract class Customer extends Person {
    private Clothing[] clothingItems;
    private char size;

    public Customer(String name, char size) {
        super(name);
        this.size = size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "Customer{" +
                ", size=" + size +
                '}';
    }




}
