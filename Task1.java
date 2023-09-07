import java.util.Scanner;


public class Task1 {
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
    необходимо повторно запросить у пользователя ввод данных.
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Вы ввели: " + inputUserFloat());
    }
    public static float inputUserFloat(){
        float number = 0;
        boolean process = true;

        while (process) {
            System.out.print("Введите число:");
            try {
                number = Float.parseFloat(scanner.nextLine());
                process =false;
            } catch (NumberFormatException e) {
                System.out.println("Введённые данные не являются дробным числом. Попробуйте ещё раз");
            }
        }
        return number;
    }

}
