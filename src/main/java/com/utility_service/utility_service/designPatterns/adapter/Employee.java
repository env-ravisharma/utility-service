package core.designPatterns.adapter;

public class Employee {

    String employeeName;
    String getEmployeeEmail;

    public Employee(String employeeName, String getEmployeeEmail) {
        this.employeeName = employeeName;
        this.getEmployeeEmail = getEmployeeEmail;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGetEmployeeEmail() {
        return getEmployeeEmail;
    }

    public void setGetEmployeeEmail(String getEmployeeEmail) {
        this.getEmployeeEmail = getEmployeeEmail;
    }

}
