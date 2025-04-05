package validateJsonStructure;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            File file=new File("C:\\Users\\Irshad\\IdeaProjects\\jsonAssignment\\src\\main\\java\\validateJsonStructure\\user.json");
            User user=objectMapper.readValue(file,User.class);
            System.out.println("Valid JSON Data");
        } catch (Exception e) {
            System.out.println("Invalid json data"+e.getMessage());
        }
    }
}
