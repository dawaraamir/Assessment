package fakeshoppingapp;

public class Manager extends Employee implements Discountable{
    private final double DISCOUNT = .25;

    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {

    }

    @Override
    public double getDISCOUNT() {
        return DISCOUNT;
    }


    @Override
    public String toString() {
        return "Manager{}";
    }

    @Override
    public double caclDiscount() {
        return getDISCOUNT() * DISCOUNT;
    }

}
