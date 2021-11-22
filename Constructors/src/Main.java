public class Main {

    public static void main(String[] args) {
/*      BankAccount account = new BankAccount(); //"65215",0.00,"Akshay Munot",
               // "akshaymunot30@gmail.com","9146901939");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getCustomerName());

        account.withdraw(100.0);

        account.deposit(50.0);
        account.withdraw(100.0);

        account.deposit(51.0);
        account.withdraw(100.0);

        BankAccount newAccount = new BankAccount("Tim", "tim@email.com", "5564546");
        System.out.println(newAccount.getAccountNumber() + " name " + newAccount.getCustomerName());
*/

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", "bob@email.com");
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Tina", 2500.0,
                "tina@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmail());
    }
}
