package HomeWork2;

import java.util.Objects;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день! Введите ваше имя.");
        String answer = scanner.nextLine();
        boolean name1 = Objects.equals("Анастасия", "Василий");
         switch(name1) {
             case 1:
                 System.out.println("Привет Василий!");
                 break;
             case 2:
                 System.out.println("Анастасия! Я тебя так долго ждал!");
                 break;
             default:
                 System.out.println("Здраствуйте! А вы кто?");
         }
    }
}
