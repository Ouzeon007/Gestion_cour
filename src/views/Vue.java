package views;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Vue {
    protected  static Scanner scanner;
    public static void setScanner(Scanner scanner) {
        Vue.scanner = scanner;
    }

     public LocalDate formatDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date,formatter);
    }

    public LocalTime fomatHeure(String heure){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(heure,formatter);
    }
}
