import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbers {

    public static void main(String[] args) throws IOException {
        int total = 0;
        try(FileReader fr = new FileReader("numberstosum.zip")) {
            BufferedReader reader = new BufferedReader(fr);
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                total = total + Integer.parseInt(line);
            }
        }
    }
}
