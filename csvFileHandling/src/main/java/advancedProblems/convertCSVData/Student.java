package advancedProblems.convertCSVData;

public class Student {
    String id;
    String name;
    String department;
    String age;

    public Student(String id, String name, String department, String age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }
    @Override
    public String toString(){
        return "{ " +
                " id = "+id+
                " name = "+name +
                " Department = "+department+
                " age = "+age +" }";
    }
}
