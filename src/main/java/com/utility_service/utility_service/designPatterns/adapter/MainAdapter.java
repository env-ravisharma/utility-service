package core.designPatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Student person = new Student("person1", "person1@gmail.com");
        Employee employee = new Employee("employee1", "employee1@gmail.com");

        personList.add(person);
        personList.add(new EmployeeAdapter(employee)); //implemented adapter to covert employee to person.

        System.out.println(person);
    }

}
