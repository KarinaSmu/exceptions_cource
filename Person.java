import java.text.SimpleDateFormat;
import java.util.Date;

class Person {
    private String name;
    private String surname;
    private String patronymic;
    private Date birthDate;
    private String phoneNumber;
    char  sex;

    public Person(String name, String surname, String patronymic, Date birthDate, String phoneNumber, char sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }
    public String getFormattedBirthDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(birthDate);
    }
    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + " " + getFormattedBirthDate() + " " + phoneNumber + " " + sex;
    }
}
