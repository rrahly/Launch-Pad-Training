public class IncorrectAccountTypeException extends UnidentifiedAccoutException{
    //private  UnidentifiedAccoutException IncorrectAccountTypeException;
    @Override
    public String getMessage(){
        System.out.println("Incorrect Account Type Exception");
        return ""; //To change body of generated methods, choose Tools | Templates.
    }
//    public void IncorrectAccountType(){
//        System.out.println("Incorrect Account Type Exception");
//        //throw IncorrectAccountTypeException;
//    }
}
