package org.regular;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {
    public MyFile() {
    }

    public static void writeToFile(String var0, String var1) {
        try {
            File var2 = new File("D:\\prog\\javaCore\\src\\main\\java\\org\\example\\notes.txt");
            FileWriter var3 = new FileWriter(var2, true);
            var3.write(var0 + " -> " + var1 + "\n");
            var3.close();
            System.out.println("Запись прошла успешно");
        } catch (IOException var4) {
            var4.printStackTrace();
        }

    }
}