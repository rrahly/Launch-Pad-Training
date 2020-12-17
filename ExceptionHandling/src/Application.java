
public class Application {
    public static void main(String [] args){
        try {
            Withdraw w= new Withdraw();
            w.withdraw();
        } catch (TransactionException ex) {
            System.out.println("unable to withdraw");
        }
    }
}
