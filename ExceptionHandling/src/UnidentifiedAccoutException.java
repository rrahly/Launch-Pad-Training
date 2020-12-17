public class UnidentifiedAccoutException extends RuntimeException{

    //private  RuntimeException UnidentifiedAccoutException;
    @Override
    public String getMessage(){
        System.out.println("Unidentified Account Exception");
        return ""; //To change body of generated methods, choose Tools | Templates.
    }
//    public void UnidentifiedAccount(){
//        System.out.println("Unidentified Account Exception");
//        //throw UnidentifiedAccoutException;
//    }
}
