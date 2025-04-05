package advancedProblems.detectDuplicates;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\advancedProblems\\detectDuplicates\\data.csv";
        HashMap<String, Integer> idCountMap = new HashMap<>();

        try {
            CSVReader csvReader = new CSVReader(new FileReader(path));
            List<String[]> list = csvReader.readAll();
            for (int i = 1; i < list.size(); i++) {
                String[] row = list.get(i);
                String name = row[1];
                idCountMap.put(name, idCountMap.getOrDefault(name, 0) + 1);
            }

            System.out.println("Duplicate records based on the ID column:");
            boolean hasDuplicates = false;

            for (String name : idCountMap.keySet()) {
                if (idCountMap.get(name) > 1) {
                    hasDuplicates = true;
                    System.out.println("Name: " + name + " - Count: " + idCountMap.get(name));
                }
            }

            if (!hasDuplicates) {
                System.out.println("No duplicate records found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
