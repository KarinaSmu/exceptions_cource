import java.util.Scanner;

public class Task4 {
    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        try {
            inputUserString();
        } catch (DataInputException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Метод, позволяет пользователю ввести строку
     * @throws DataInputException
     */
    public static void inputUserString() throws DataInputException {
        System.out.println("Введите строку:");
        String userString = scanner.nextLine();
        if (userString.isEmpty()){
            throw new DataInputException("Пустые строки вводить нельзя");
        }

        }

    }

