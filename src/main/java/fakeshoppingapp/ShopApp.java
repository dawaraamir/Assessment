package fakeshoppingapp;


import java.util.ArrayList;
import java.util.Collections;

public class ShopApp {
    public static void main(String[] args) {
        Clothing shirt = new Clothing("shirt", 12.99, 'm');
        Clothing pants = new Clothing("pants", 24.99, 'm');
        Clothing hat = new Clothing("hat", 14.99, 'm');

        Clothing[] managerCart = {shirt, pants, hat};
        for (int d = 0; d < managerCart.length; d++) {
            System.out.println(managerCart[d]);
        }

        Clothing[] employeeCart = {shirt, pants, hat};




        ArrayList<Clothing> clothes = new ArrayList<>();
        clothes.add(shirt);
        clothes.add(pants);
        clothes.add(hat);

        Manager manger = new Manager("David", 'L', 25);
        HourlyEmployee customer1 = new HourlyEmployee("Frank", 'm', 10);
        customer1.setSize('m');

        Discountable[] discountables = {customer1, manger};



        Clothing clothing1 = new Clothing("button up", 12.99, 's');
        clothing1.setSize('s');

        calcTotal(managerCart);
        isAFit(customer1, clothing1);
        printEmployeeName(customer1);
        printEmployeeName(manger);
        customer1.printEmpPriceAfterDisc(shirt);
        customer1.printEmpPriceAfterDisc(pants);
        manger.printEmpPriceAfterDisc(shirt);
        manger.printEmpPriceAfterDisc(hat);
        sortAndPrintClothingByPrice(clothes);
        printDiscAmtOff(discountables, shirt);
    }

    public static double calcTotal(Clothing[] manager) {
        double sum = 0;
        for (Clothing mangerLoop : manager) {
            sum += mangerLoop.getPrice();

        }
        System.out.println("Total of Manager's cart: " + "\n" + sum);
        return sum;
    }

    public static boolean isAFit(Customer customer, Clothing clothing) {
        boolean test;
        if (customer.getSize() == clothing.getSize()) {
             test = true;
        } else {
            test = false;
        }
        System.out.println("Checking if " + customer.getName() + " fits in the clothing:" );
        System.out.println(test);
        return test;
    }

    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothes) {
        Collections.sort(clothes, new DiscountComparator());
        for (Clothing x: clothes) {
            System.out.println(x);
        }
    }
    public static void printEmployeeName(Employee employee) {
        System.out.println("Printing each type of Employee's name: "  + "\n" + employee.getName());
    }

    public static void printDiscAmtOff(Discountable[] discountables, Clothing clothing) {
        for (Discountable x: discountables) {
            System.out.println("The discount price for a "+ clothing.getDescription() + " " + x.calcDiscount(clothing));

        }
        }
    }

