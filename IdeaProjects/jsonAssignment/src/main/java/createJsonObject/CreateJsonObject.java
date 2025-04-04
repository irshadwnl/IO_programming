package createJsonObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateJsonObject {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            User u1=new User("Mohit","25",22);
            String jsonData=objectMapper.writeValueAsString(u1);
            System.out.println(jsonData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
