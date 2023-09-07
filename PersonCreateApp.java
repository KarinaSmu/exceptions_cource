import java.text.ParseException;
import java.util.Scanner;

public class PersonCreateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonDataInput dataInput = new PersonDataInput(scanner);
        while (true){
            String inputData = dataInput.getInputData();
            String[] dataParts = inputData.split(" ");

            try {
                Person person = PersonParser.parsePerson(dataParts);

                String fileName = person.getSurname() + ".txt";

                PersonDataWriter dataWriter = new PersonDataWriter();
                dataWriter.writeDataToFile(fileName, person.toString());

                System.out.println("Data saved successfully.");
                return;
            } catch ( DataParseException | PersonDataException  e) {
                System.err.println("Error: " + e.getMessage());
            }
        }


    }
}


