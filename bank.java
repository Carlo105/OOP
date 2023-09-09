package BANKACCOUNT;

public class bank {
    public static void main(String[] args) {
        bankDetails myAccount = new bankDetails(18104552, 1000.00, "John Doe", "johndoe@gmail.com", 123456);
        System.out.println("Initial Account Information:");
        bankDetails.displayAccountInfo(myAccount);

        myAccount.deposit((double) 1500.00);
        System.out.println("Account Information after the deposit:");
        bankDetails.displayAccountInfo(myAccount);

        myAccount.withdraw((double) 1200.00);
        System.out.println("Account Information after the withdrawal:");
        bankDetails.displayAccountInfo(myAccount);

        myAccount.withdraw((float) 5000.00);
        System.out.println("Account Information after the failed withdrawal:");
        bankDetails.displayAccountInfo(myAccount);
    }
}
