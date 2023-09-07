public class Task2 {
    //Задание 2
    public static void DivisionException() {
        int[] intArray = new int[]{2, 6, 3, 6, 9, 43, 9, 3, 7, 5};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / (double) d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    //Задание 3

    public static void main(String[] args) throws Exception {
        DivisionException();

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
    }

}
