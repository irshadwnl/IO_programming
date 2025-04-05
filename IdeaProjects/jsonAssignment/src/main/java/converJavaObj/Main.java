package converJavaObj;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper=new ObjectMapper();
            List<Car>cars=new ArrayList<>();
            cars.add(new Car("Ertiga","2025","Maruti"));
            cars.add(new Car("M5","2024","BMW"));
            cars.add(new Car("Verna","2025","Hyundai"));

            String jsonData= objectMapper.writeValueAsString(cars);
            System.out.println(jsonData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
