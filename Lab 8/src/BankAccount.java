public class BankAccount {
    private String accountNumber;
    private int initialBalance;

    public BankAccount(String accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
    }

    public void withdraw(int amount) throws InsuffientBalanceException {

        int remaining = initialBalance - amount;

        if (remaining < 0) {
            throw new InsuffientBalanceException("Error");
        }
        else {
            System.out.println("\nYou have withdrawn $" + amount);
            System.out.println("Remaining Balance: " + remaining);
        }
    }

    public int calculateInterest(int principal, int rate, int time) throws InvalidRateException {
        if (rate>100){
            throw  new InvalidRateException("Rate cannot be more than 100");
            }
        else {
            return principal * (int) Math.pow(1 + rate / rate, time);
        }
    }
}
