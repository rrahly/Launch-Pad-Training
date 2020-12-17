public class InsufficientFundsException extends TransactionException{
    //private  TransactionException InsufficientFundsException;
    @Override
    public String getMessage(){
        System.out.println("Insufficient Funds Exception");
        return ""; //To change body of generated methods, choose Tools | Templates.
    }
//    public void Insufficientfunds(){
//        System.out.println("Insufficient Funds Exception");
//    }
}
