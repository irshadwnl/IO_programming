package advancedProblems.mergeTwoCSV;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\advancedProblems\\mergeTwoCSV\\student1.csv";
        String file2 = "C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\advancedProblems\\mergeTwoCSV\\student2.csv";
        String outputFile = "C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\advancedProblems\\mergeTwoCSV\\output.csv";

        HashMap<String, String[]> map = new HashMap<>();

        try (
                CSVReader csvReader1 = new CSVReader(new FileReader(file1));
                CSVReader csvReader2 = new CSVReader(new FileReader(file2));
                CSVWriter csvWriter = new CSVWriter(new FileWriter(outputFile))
        ) {
            List<String[]> data1 = csvReader1.readAll();
            List<String[]> data2 = csvReader2.readAll();

            for (String[] s : data1.subList(1, data1.size())) {
                map.put(s[0], s);
            }


            for (String[] s : data2.subList(1, data2.size())) {
                if (map.containsKey(s[0])) {
                    String[] existingData = map.get(s[0]);
                    map.put(s[0], new String[]{s[0], existingData[1], existingData[2], s[1], s[2]});
                } else {

                    map.put(s[0], new String[]{s[0], "", "", s[1], s[2]});
                }
            }

            csvWriter.writeNext(new String[]{"ID", "NAME", "AGE", "MARKS", "GRADE"});

            for (String[] s : map.values()) {
                csvWriter.writeNext(s);
            }


            csvWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try (CSVReader reader = new CSVReader(new FileReader(outputFile))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println(String.join(" ", line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
