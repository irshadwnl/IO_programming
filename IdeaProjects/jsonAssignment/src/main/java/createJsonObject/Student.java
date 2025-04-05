package createJsonObject;

import java.util.List;

public class Student {
    private String name;
    private List<String> subjects;
    private int age;

    public Student(String name, List<String> subjects, int age) {
        this.name = name;
        this.subjects = subjects;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }


}
