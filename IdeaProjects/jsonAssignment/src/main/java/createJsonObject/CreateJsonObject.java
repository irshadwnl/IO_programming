package createJsonObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateJsonObject {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            Student u1=new Student("Mohit",new ArrayList<>(Arrays.asList("Hindi","english","math")),22);
            String jsonData=objectMapper.writeValueAsString(u1);
            System.out.println(jsonData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
