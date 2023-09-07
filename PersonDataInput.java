import java.util.Scanner;

public class PersonDataInput {
    private Scanner scanner;

    public PersonDataInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInputData() {
        System.out.println("Enter your personal data in the following format:");
        System.out.println("Surname Name Patronymic BirthDate(dd.MM.yyyy) PhoneNumber(only numbers) Sex(f or m)");
        System.out.println("Separate each field with a space.");
        return scanner.nextLine();
    }
}
