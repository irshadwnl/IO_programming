package mergeTwoJsonObject;

public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Name:- "+name +" Age:- "+age;
    }
}
