import java.io.File;
import java.io.FileNotFoundException;

public class DecodingMain {
    public static void main(String[] args) throws FileNotFoundException {
        DecodingMessage dm = new DecodingMessage();
        String result = "";
        File ourFile = new File("coding_qual_input.txt");
        result = dm.decode(ourFile);
        System.out.println(result);
    }
}
