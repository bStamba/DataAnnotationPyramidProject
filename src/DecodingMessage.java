import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DecodingMessage {

    public String decode(File message_file) throws FileNotFoundException {

        //Variables for our Hashmap, an array to hold our line of 2 "strings",
        //our resulting string, and an incrementor.
        Map<String, String> ourWords = new HashMap<String, String>();
        String result = "";
        String line = "";

        //Read in our text file called coding_qual_input.txt, where we use the split method to create our
        //key and value pairs to add to our hashmap.
        try(BufferedReader br = new BufferedReader(new FileReader("coding_qual_input.txt"))){
            while ((line = br.readLine()) != null) {
                String[] ourStrings = line.split(" ");
                ourWords.put(ourStrings[0], ourStrings[1]);
            }
        } catch (IOException e){
            System.out.println("Error reading file.");
        }

        int incrementor = 2;
        //Iterate through the entries in the hashmap using our key to get the string to add
        //the word that is at the end of our "pyramid" line.
        for(int i = 1; i < ourWords.size(); i = i + incrementor){
            result = result + ourWords.get(String.valueOf(i)) + " ";
            incrementor++;
        }

        return result.trim();
    }
}
