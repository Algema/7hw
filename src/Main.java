public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание 1
        String firstName = " Ivanov";
        String middleName= " Ivan ";
        String lastName = "Ivanovic";
        String fullName = firstName + middleName + lastName;
        System.out.println(fullName);

        // Задание 2
        String s1 = fullName.toUpperCase();
        System.out.println(s1);

        //Задание 3
        String fullNameRus = "Иванов Семён Семёнович";
        String newfullName=fullNameRus.replace("ё", "е");
        System.out.println(newfullName);

    }
}