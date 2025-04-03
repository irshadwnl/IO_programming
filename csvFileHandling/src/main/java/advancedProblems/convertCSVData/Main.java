package advancedProblems.convertCSVData;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile="C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\advancedProblems\\convertCSVData\\student.csv";
        List<Student> list=new ArrayList<>();
        try{
            CSVReader csvReader=new CSVReader(new FileReader(csvFile));
            String s[];
            s= csvReader.readNext();
            while ((s= csvReader.readNext())!=null){
                Student obj=new Student(s[0],s[1],s[2],s[3]);
                list.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);
    }
}
