class Bank{

    private static String bankName = "Bank Of Baroda";

    private static String accountHolder;
    private final long accountNumber;
    private static int totalAccounts = 0;

    Bank(String accountHolder,long accountNumber){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        totalAccounts++;
    }

    public static int getTotalAccount(){
        return totalAccounts;
    }

    public void displayInstanceOf(){
        if (this instanceof Bank) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("This object is not an instance of BankAccount.");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank user1 = new Bank("Vinay" , 50701000);
        user1.displayInstanceOf();
        System.out.println("Total number of accounts is : " + user1.getTotalAccount());

        Bank user2 = new Bank("Pushpendra" , 50701001);
        user2.displayInstanceOf();
        System.out.println("Total number of accounts is : " + user2.getTotalAccount());


        Bank user3 = new Bank("Somya" , 50701002);
        user3.displayInstanceOf();
        System.out.println("Total number of accounts is : " + user1.getTotalAccount());

    }
}
