package fakeshoppingapp;

public class Main {
    public static void main(String[] args) {
        Clothing shirt = new Clothing("Cotton",12.99, 'm');
        Clothing pants = new Clothing("denim", 24.99, 'm');
        Clothing hat = new Clothing("Wool", 14.99, 'm');

        Clothing[] managerCart = {shirt, pants, hat};
        for (int d = 0; d < managerCart.length; d++){
            System.out.println(managerCart);

        }
        Manager manager = new Manager("David", managerCart, 'm');

        Clothing[] employeeCart = {shirt, pants, hat};
        for (int d = 0; d < employeeCart.length; d++) {
            System.out.println(employeeCart);
        }
        Employee employee = new Employee("Frank", employeeCart, 's') {
            @Override
            public void printEmpPriceAfterDisc(Clothing clothing) {

            }
        };
    }
}
