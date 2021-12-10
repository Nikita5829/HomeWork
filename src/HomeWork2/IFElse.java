package HomeWork2;

import java.util.Objects;
import java.util.Scanner;

public class IFElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день! Введите ваше имя.");
        String answer = scanner.nextLine();
        boolean name1 = Objects.equals(answer, "Василий");
        boolean name2 = Objects.equals(answer, "Анастасия");
        if (name1){
            System.out.println("Привет! Василий");
            System.out.println("Я тебя долго ждал!");
        }else  if (name2){
            System.out.println("Анастасия! Я тебя так долго ждал!");
        }else {
            System.out.println("Здраствуйте! А вы кто?");
        }
    }
}
