import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PersonDataWriter {
    public void writeDataToFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
