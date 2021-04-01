package fakeshoppingapp;

public class Manager extends Employee implements Discountable{

    public Manager(String name, char size, double discount) {
        super(name, size , discount);
    }


    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * (getDiscount() / 100);
    }


    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println("Manager price for " + clothing.getDescription() + " after discount" + "\n" + "$"  + clothing.getPrice() * (getDiscount() / 100));
    }
}
