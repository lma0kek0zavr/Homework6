

public class App {
    public static void main(String[] args) throws Exception {
       
        //Задача №1

        String firstName = "Ivan";

        String middleName = "Ivanovich";

        String lastName = "Ivanov";

        String fullName = String.join(" ", lastName, firstName, middleName);

        System.out.printf("\nФ. И. О. сотрудника - %s", fullName);

        //Задача №2

        String upperFullName = fullName.toUpperCase();

        System.out.printf("\nДанные Ф. И. О. сотрудника для заполнения отчета - %s", upperFullName);

        //Задача №3

        String fullName2 = "Иванов Семён Семёнович";

        String newFullName = fullName2.replace('ё', 'е');

        System.out.printf("\nДанные Ф. И. О. сотрудника - %s", newFullName);
    }
}
