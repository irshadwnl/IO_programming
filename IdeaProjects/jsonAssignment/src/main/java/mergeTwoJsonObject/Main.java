package mergeTwoJsonObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            User u1=new User("Irshad",22);
            User u2=new User("Mohit",23);
            JsonNode jsonNode1=objectMapper.valueToTree(u1);
            JsonNode jsonNode2=objectMapper.valueToTree(u2);
            ObjectNode objectNode=objectMapper.createObjectNode();
            objectNode.set("user1",(ObjectNode)jsonNode1);
            objectNode.set("user2",(ObjectNode) jsonNode2);
            String jsonData= objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectNode);
            System.out.println(objectNode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
