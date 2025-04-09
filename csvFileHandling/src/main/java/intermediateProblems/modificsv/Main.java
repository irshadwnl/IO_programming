package intermediateProblems.modificsv;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String path ="C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\intermediateProblems\\modificsv\\modifi.csv";
        try {
            CSVReader csv = new CSVReader(new FileReader(path));
            String line[];
//            csv.readNext();
//            System.out.println();
            while ((line = csv.readNext())!=null){
                if(line[0].equalsIgnoreCase("IT")){
                    double salary = Double.parseDouble(line[3]);
                    salary*=1.10;
                    line[3] = String.format("%.2f", salary);
                }
                for (String l : line){
                    System.out.print(l+" ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
