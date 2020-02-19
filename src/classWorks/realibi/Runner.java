package classWorks.realibi;

public class Runner {
    public static void main(String[] args) {
        Customer customer1 = new Customer("alibi", "duysenaliev", "erlanovich", "seifullina 40", "5169493150504890", 101);
        Customer customer2 = new Customer("vadim", "kuprienko", "aleksandrovich", "abaya 24", "5169493132245643", 102);
        Customer customer3 = new Customer("vlad", "lebedev", "sergeevich", "momyshuly 45", "5169493112344532", 103);
        Customer customer4 = new Customer("temirlan", "iphone", "maratov", "respublika 2", "5169493112344532", 104);

        Customer.customers.add(customer1);
        Customer.customers.add(customer2);
        Customer.customers.add(customer3);
        Customer.customers.add(customer4);

        System.out.println("\nКлиенты, номер счета которых находится в заданном диапазоне: ");
        Customer.showCustomersWithinInterval(99, 102);

        System.out.println("\nВсе клиенты (имена отсортированы по алфавиту): ");
        Customer.showCustomers();
    }
}
