package fakeshoppingapp;

public class HourlyEmployee extends Employee implements Discountable {
    public HourlyEmployee(String name, char size, double discount) {
        super(name, size, discount);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{}";
    }
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * (getDiscount() /100 );
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        double pay = clothing.getPrice() * (getDiscount() /100 );
        System.out.println("Hourly employee price for " + clothing.getDescription() + " after discount" + "\n" + "$" + pay);
    }
}
