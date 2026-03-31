package dev.tanto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    public static ArrayList<NameDict> readContent() {
        try {
            return tryReadContent();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    private static ArrayList<NameDict> tryReadContent() throws FileNotFoundException {
        ArrayList<NameDict> nameDictList = new ArrayList<>();
        String fileName = Prop.getFileName();
        File file = new File(fileName);
        try(Scanner scanner = new Scanner(file, "UTF-8")) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        return nameDictList;
    }
}
