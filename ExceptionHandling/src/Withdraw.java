public class Withdraw {

    public void withdraw() throws TransactionException, IncorrectAccountTypeException {
        BalanceValidation bv= new BalanceValidation();
        bv.validate();
        TransactionException te= new TransactionException();
        te.getMessage();
        //throw te;

    }
}
