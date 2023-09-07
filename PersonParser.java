import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonParser {
    private static boolean isValidSexValue(String sexValue) {
        return sexValue.equalsIgnoreCase("f") || sexValue.equalsIgnoreCase("m");
    }
    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d+");
    }

    /**
     * Разбирает входные данные и создает объект Person.
     *
     * @param dataParts Массив частей входных данных.
     * @return Объект Person, созданный на основе разобранных данных.
     * @throws PersonDataException Некорректный объём входных данных.
     * @throws DataParseException Невеныйформат введённых данных.
     */
    public static Person parsePerson(String[] dataParts) throws PersonDataException, DataParseException {

        if (dataParts.length != 6) {
            throw new PersonDataException("Incorrect input data.");
        }

        String surname = dataParts[0];
        String name = dataParts[1];
        String patronymic = dataParts[2];
        if (!surname.matches("^[a-zA-Z\\s]*$") || !name.matches("^[a-zA-Z\\s]*$") || !patronymic.matches("^[a-zA-Z\\s]*$")) {
            throw new PersonDataException("Invalid characters in name");
        }
        Date birthDate;
        String phoneNumber = dataParts[4];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            birthDate = dateFormat.parse(dataParts[3]);
        } catch (ParseException e) {
            throw new DataParseException("Wrong format of date: " + dataParts[3]);
        }
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new PersonDataException("Invalid phone number: " + phoneNumber);
        }
        char sexValue = dataParts[5].toUpperCase().charAt(0);

        if (!isValidSexValue(String.valueOf(sexValue))) {
            throw new PersonDataException("Invalid sex value: " + sexValue);
        }

        return new Person(surname, name, patronymic, birthDate, phoneNumber, sexValue);
    }
}

