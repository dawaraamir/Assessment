package fakeshoppingapp;

public class Manager extends Employee implements Discountable{

    public Manager(String name, char size, double discount) {
        super(name, size , discount);
    }

    public double caclDiscount() {
        return getDiscount();
    }


    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println("Manager price for " + clothing.getDescription() + " after discount" + "\n" + "$"  + clothing.getPrice() * (getDiscount() / 100));
    }

}
