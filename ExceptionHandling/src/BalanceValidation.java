public class BalanceValidation {

    public void validate() throws InsufficientFundsException{
        SavingsAccount sv= new SavingsAccount();
        sv.validateAccount();
        InsufficientFundsException ife= new InsufficientFundsException();
        ife.Insufficientfunds();

    }
}
