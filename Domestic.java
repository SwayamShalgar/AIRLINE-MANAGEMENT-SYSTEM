import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class Domestic {
    public static void main(String[] args) {
        String str;
        Vector v = new Vector(50);

        File myFile = new File("Reservation");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fileWriter = new FileWriter("Reservation");
                str = "****RESERVATIONS****\n";
                fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
