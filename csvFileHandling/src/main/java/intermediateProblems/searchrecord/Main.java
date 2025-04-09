package intermediateProblems.searchrecord;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            String path ="C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\intermediateProblems\\searchrecord\\data.csv";
            CSVReader csv = new CSVReader(new FileReader(path));
            csv.readNext();
            String line[];
            while ((line = csv.readNext())!=null){
                String toFound = line[1];
                String forSearch = "John Doe";

                if(toFound.equals(forSearch)){
                    for(String l : line){
                        System.out.print(l+" ");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
