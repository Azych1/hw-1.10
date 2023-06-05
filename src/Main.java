import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();


    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";

        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fixedFullName);
        System.out.println();
    }


}