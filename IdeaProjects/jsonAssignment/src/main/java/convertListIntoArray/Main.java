package convertListIntoArray;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            Employee e1=new Employee("Irshad","Testing");
            Employee e2=new Employee("Sam","HR");
            List<Employee> employees=new ArrayList<>();
            employees.add(e1);
            employees.add(e2);
            String jsonArray= objectMapper.writeValueAsString(employees);
            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
