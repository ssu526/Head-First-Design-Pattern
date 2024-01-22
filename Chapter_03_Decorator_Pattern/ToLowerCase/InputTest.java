package Chapter_03_Decorator_Pattern.ToLowerCase;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "\\Chapter_3_Decorator_Pattern\\ToLowerCase\\test.txt";
        int c;
        try{
            InputStream in = new LowerCaseInputStream(
                             new BufferedInputStream(
                             new FileInputStream(filePath)));

            while((c = in.read()) > 0){
                System.out.print((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
