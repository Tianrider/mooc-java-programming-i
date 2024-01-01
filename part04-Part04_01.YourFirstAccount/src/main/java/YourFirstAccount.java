

public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java                                                                            
        // Write your program here 
        Account artosAccount = new Account("Matthews account", 1000.00);
        Account accountTes = new Account("My account", 0);
        
        artosAccount.withdrawal(100);
        accountTes.deposit(100);
        
        System.out.println(artosAccount);
        System.out.println(accountTes);
    }
}
