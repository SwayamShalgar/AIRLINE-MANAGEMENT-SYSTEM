import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class SpiceSeats {
    public static void main(String[] args) {
        String str;
        Vector v = new Vector(50);

        File myFile = new File("Spice");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fileWriter = new FileWriter("Spice");
            for (int i = 1;i <= 51; i++ ){
                str = "B"+i+"\n";
                fileWriter.write(str);
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
