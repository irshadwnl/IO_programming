package basic_problems.countlines;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try{
            String path ="C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\basic_problems\\countlines\\count.csv";

            CSVReader csv = new CSVReader(new FileReader(path));
            int c=0;
            String line[];
            while((line = csv.readNext() )!=null){
                c++;
            }
            System.out.println("Number of records : "+c);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
