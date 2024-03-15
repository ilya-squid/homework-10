public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задание 1");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //task 2
        System.out.println("Задание 2");

        String fullName1 = "Ivanov Ivan Ivanovich";
        String capitalizedFullName = fullName1.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + capitalizedFullName);

        //task 3
        System.out.println("Задание 3");

        String fullName2 = "Иванов Семён Семёнович";
        char[] charArray = fullName2.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'ё') {
                charArray[i] = 'е';
            }
        }
        String updatedFullName = new String(charArray);

        System.out.println("Данные Ф. И. О. сотрудника — " + updatedFullName);
    }
}