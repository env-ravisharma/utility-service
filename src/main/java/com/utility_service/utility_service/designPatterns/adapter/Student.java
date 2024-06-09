package core.designPatterns.adapter;

public class Student implements Person {

    String name;
    String email;

    public Student(String personName, String personEmail) {
        this.name = personName;
        this.email = personEmail;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
