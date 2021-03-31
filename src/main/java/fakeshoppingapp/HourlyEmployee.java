package fakeshoppingapp;

public class HourlyEmployee extends Employee implements Discountable {
    public HourlyEmployee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    public double getDiscount() {
       return getDISCOUNT();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{}";
    }

    @Override
    public double caclDiscount() {
        return getDiscount() * getDISCOUNT();
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {

    }
}
