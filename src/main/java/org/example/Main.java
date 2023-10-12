package org.example;

import java.util.Scanner;
import org.regular.MyFile;
import org.regular.Time;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        while(true) {
            System.out.print("Введите текст новой заметки заметки: ");
            Scanner scan = new Scanner(System.in);
            String var2 = scan.nextLine();

            String var3 = Time.timeIsNow();
            if (var2.equals("q")) {
                break;
            }else {
                MyFile.writeToFile(var3, var2);
                System.out.println("Для выхода из программы введите q");
            }

        }
    }
}
