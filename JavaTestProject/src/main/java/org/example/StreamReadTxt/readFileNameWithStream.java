package org.example.StreamReadTxt;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class readFileNameWithStream {

    public static void main(String[] args) {

        File dest = new File("C:\\Nijat\\Text Datei\\newReadWrite.txt");

        try {
//            Files.walk(Path.of("C:\\Nijat\\Text Datei\\Neuer Ordner"))
//            Files.walk(Path.of("\\\\192.168.23.1\\SV-Dateiablage\\stammdat"))
            List<File> allFiles = Files.walk(Path.of("C:\\Nijat\\Text Datei\\txtRead"))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile).toList();

//            System.out.println(allFiles.size());
            for (File file : allFiles) {
                String fileRead = file.getAbsolutePath();
                    try (FileReader reader = new FileReader(fileRead);
                         BufferedReader br = new BufferedReader(reader)) {
                        // read line by line
                        String line;
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);

                            try (FileWriter writer = new FileWriter("C:\\Nijat\\Text Datei\\newReadWrite.txt");
                                 BufferedWriter bw = new BufferedWriter(writer)) {
                                 bw.write(line);
                                 bw.flush();
                                    } catch (IOException e) {
                                        System.err.format("IOException: %s%n", e);
                                    }
                                }
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                        }
                    }
            } catch (IOException e) {
                throw new RuntimeException(e);
        }
    }
}




