package BANKACCOUNT;

public class bankDetails{
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public bankDetails(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return (float) accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double money){
        this.accountBalance +=  money;
        System.out.println("This is now your current balance : $" + accountBalance);
    }

    public void withdraw(double money){
        double difference = this.accountBalance - money;
        if(difference >= 0){
            this.accountBalance -= money;
            System.out.println("money withdrawn: " + "$" + money);
            System.out.println("after withdraw: " + "$" + accountBalance);
        } else {
            System.out.println("Insufficent funds to withdraw.");
        }
    }
    public static void displayAccountInfo(bankDetails account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Account Balance: ₱" + account.getAccountBalance());
    }

}