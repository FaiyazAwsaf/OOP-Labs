public class BankingSystem {
    public static void main(String[] args) throws InsuffientBalanceException, InvalidRateException {
        BankAccount account = new BankAccount ("123 ", 1000) ;

        try {
            int interestA1 = account.calculateInterest ( 20000 , 0 , 6 );
            int interestA2 = account.calculateInterest ( 20000 , 110 , 6 );
         }
        catch (InvalidRateException ire) {
            System.out.print("Error: Enter a rate below 100\n");
        }
        catch (ArithmeticException ae) {
            System.out.println("Error: Rate cannot be 0\n");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        BankAccount account1 = new BankAccount ("123 ", 1000) ;
        try{
            account1.withdraw (1500);
        }
        catch (InsuffientBalanceException ibe) {
            System.out.print("Error: Insufficient Balance\n");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        BankAccount [] accounts = new BankAccount [3];
        try {
            accounts[2] =null;

            accounts [1] = new BankAccount (" 123 ", 1000);
            accounts[1].withdraw(2000);

            accounts [3] = new BankAccount (" 123 ", 1000);
        }
        catch (ArrayIndexOutOfBoundsException aie) {
            System.out.print("Error: " + aie.getMessage() + "\n");
        }
        catch (NullPointerException npe) {
            System.out.println("Error: " + npe.getMessage() + "\n");
        }
        catch (InsuffientBalanceException ibe){
            System.out.print("Error: Insufficient Balance\n");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}