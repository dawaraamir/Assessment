package fakeshoppingapp;

public class HourlyEmployee extends Employee implements Discountable {
    public HourlyEmployee(String name, char size, double discount) {
        super(name, size, discount);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{}";
    }

    @Override
    public double caclDiscount() {
        return getDiscount();
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println("Hourly employee price for " + clothing.getDescription() + " after discount" + "\n" + "$" + clothing.getPrice() * (getDiscount() / 100));
    }
}
