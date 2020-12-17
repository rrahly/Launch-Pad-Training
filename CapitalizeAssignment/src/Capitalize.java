import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Capitalize {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("C:\\Users\\rismy\\Desktop\\cap.txt");
            br = new BufferedReader(fr);
            getUpperCase(br.readLine());
//            while ((thisline = br.readLine())!= null){
//                getUpperCase(thisline);
//                System.out.println(thisline);
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            if (br != null)
//                br.close();
        }
    }

    public static void getUpperCase(String thisline) {
        for (char c : thisline.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                c += 'A' - 'a';
            }
            System.out.println(c);
        }
    }
}
