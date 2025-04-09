package basic_problems.csvfilereader;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\basic_problems\\csvfilereader\\read.csv";

        try (CSVReader csvReader = new CSVReader(new FileReader(path))) {
            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null) {
                for(String l : nextLine){
                    System.out.print(l+" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print the error for debugging
        }
    }
}
