package parseJson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            File file=new File("C:\\Users\\Irshad\\IdeaProjects\\jsonAssignment\\src\\main\\java\\parseJson\\user.json");
            List<User> users=objectMapper.readValue(file, new TypeReference<List<User>>() {
            });
            List<User> filtered=users.stream().filter(u->u.getAge()>25).collect(Collectors.toList());
            for(User u:filtered){
                System.out.println(u);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
