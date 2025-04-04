package createJsonObject;

public class User {
    private String name;
    private String id;
    private int age;

    public User(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
