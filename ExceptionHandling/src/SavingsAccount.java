public class SavingsAccount extends Account{
    public void validateAccount() throws IncorrectAccountTypeException{
        Account a= new Account();
        a.validateAccount();
        IncorrectAccountTypeException iae= new IncorrectAccountTypeException();
        iae.getMessage();

    }
}
