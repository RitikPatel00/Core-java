package assignment3.account;

public class TestAccount {
    public static void main(String[] args) {
        // Create an Account
        Account account = new Account("A101", "John");
        System.out.println("Account: " + account);
        System.out.println();

        // Credit the account
        account.credit(1000);
        System.out.println("Account after crediting: " + account);
        System.out.println();

        // Debit the account
        account.debit(500);
        System.out.println("Account after debiting: " + account);
        System.out.println();

        // Create another Account
        Account anotherAccount = new Account("A102", "Jane", 500);
        System.out.println("Another Account: " + anotherAccount);
        System.out.println();

        // Transfer funds between accounts
        account.transferTo(anotherAccount, 300);
        System.out.println("Account after transfer: " + account);
        System.out.println("Another Account after transfer: " + anotherAccount);
    }
}
