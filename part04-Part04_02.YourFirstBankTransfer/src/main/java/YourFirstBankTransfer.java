
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        // Do not touch the code in Account.java                                                                            
        // Write your program here 
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account accountTes = new Account("My account", 0);
        
        matthewsAccount.withdrawal(100);
        accountTes.deposit(100);
        
        System.out.println(matthewsAccount);
        System.out.println(accountTes);
    }
}
