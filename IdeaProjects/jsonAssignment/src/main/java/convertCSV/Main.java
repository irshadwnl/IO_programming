package convertCSV;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import org.json.JSONArray;
import org.json.JSONObject;
import parseJson.User;

import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            String file="C:\\Users\\Irshad\\IdeaProjects\\jsonAssignment\\src\\main\\java\\convertCSV\\user.csv";
            CSVReader csvReader=new CSVReader(new FileReader(file));
            List<String[]> line=csvReader.readAll();
            String headers[]= line.get(0);
            JSONArray jsonArray=new JSONArray();
            for(int i=1;i< line.size();i++){
                JSONObject jsonObject=new JSONObject();
                String data[]= line.get(i);
                for(int j=0;j< headers.length;j++){
                    jsonObject.put(headers[j],data[j]);
                }
                jsonArray.put(jsonObject);
            }
            System.out.println(jsonArray.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
