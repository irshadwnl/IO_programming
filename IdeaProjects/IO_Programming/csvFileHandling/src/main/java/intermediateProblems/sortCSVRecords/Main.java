package intermediateProblems.sortCSVRecords;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\intermediateProblems\\sortCSVRecords\\employees.csv";
        List<String[]> employees = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFile))) {
            String[] line;
            csvReader.readNext();

            while ((line = csvReader.readNext()) != null) {
                employees.add(line);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        Collections.sort(employees, new Comparator<String[]>() {
            @Override
            public int compare(String[] e1, String[] e2) {
                return Integer.compare(Integer.parseInt(e2[3]), Integer.parseInt(e1[3]));
            }
        });

        System.out.println("Top 5 Highest-Paid Employees:");
        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            System.out.println("Name: " + employees.get(i)[1] + ", Salary: " + employees.get(i)[3]);
        }
    }
}
