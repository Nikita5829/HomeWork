package HomeWork1;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("Василий")) {
            System.out.println("Привет Василий");
            System.out.println("Я тебя так долго ждал!");
        } else if (s.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");

        } else {
            System.out.println("Здраствуйте! А вы кто?");
        }

    }
}

