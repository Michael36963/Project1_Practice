package org.example.StreamReadTxt;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TextStreamRead {

    public static void main(String[] args) {

//        try {
//            Files.walk(Path.of("C:\\Nijat\\Text Datei\\Neuer Ordner"))
//                    .filter(Files::isRegularFile)
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            List<File> filesInFolder = Files.walk(Path.of("C:\\Nijat\\Text Datei"))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile).toList();
//            System.out.println(filesInFolder.size());

//            filesInFolder.forEach(System.out::println);
            for (File file : filesInFolder) {
                String fileRead = file.getAbsolutePath();
                InputStreamReader read = new InputStreamReader(new FileInputStream(fileRead),"ISO-8859-1");
                BufferedReader bufferedReader = new BufferedReader(read);
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("-------------------------------------------");
            }
        } catch (IOException e) { throw new RuntimeException(e);
        }
    }
}
