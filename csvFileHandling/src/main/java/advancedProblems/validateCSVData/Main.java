package advancedProblems.validateCSVData;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String csvFile="C:\\Users\\Irshad\\IdeaProjects\\IO_Programming\\csvFileHandling\\src\\main\\java\\advancedProblems\\validateCSVData\\data.csv";
        List<String> list=new ArrayList<>();
        try{
            CSVReader csvReader=new CSVReader(new FileReader(csvFile));
            String s[];
            s= csvReader.readNext();
            String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            String regexPhone = "^(\\d{10}|\\d{3}-\\d{3}-\\d{4})$";
            Pattern pe=Pattern.compile(regexEmail);
            Pattern pm=Pattern.compile(regexPhone);
            while ((s= csvReader.readNext())!=null){
                Matcher me=pe.matcher(s[1]);
                Matcher mm= pm.matcher(s[2]);
                if(me.matches() && mm.matches() ){
                    list.add(String.join(" ",s));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);
    }
}
