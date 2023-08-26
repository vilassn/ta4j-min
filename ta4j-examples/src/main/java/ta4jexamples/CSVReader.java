package ta4jexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String rootFolderPath = "C:\\Users\\Admin\\wave\\appdata\\datafeed\\historical";
        long startTime = System.currentTimeMillis();
        readCSVFilesRecursively(new File(rootFolderPath));
        long endTime = System.currentTimeMillis();
        double totalTime = (endTime - startTime) / 1000.0;
        System.out.printf("Total time required: %.6f seconds%n", totalTime);
    }

    private static void readCSVFilesRecursively(File folder) {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                readCSVFilesRecursively(file);
            } else if (file.isFile() && file.getName().endsWith(".csv")) {
//                System.out.println("Reading contents of: " + file.getAbsolutePath());
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
//                        System.out.println(line);
                        int len =0;
                        len = len + line.length();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
//                System.out.println();
            }
        }
    }
}

