import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class IndigoSeates {
    public static void main(String[] args) {
        String str;
        Vector v = new Vector(50);

        File myFile = new File("Indigo");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fileWriter = new FileWriter("Indigo");
            for (int i = 1;i <= 51; i++ ){
                str = "A"+i+"\n";
                fileWriter.write(str);
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
