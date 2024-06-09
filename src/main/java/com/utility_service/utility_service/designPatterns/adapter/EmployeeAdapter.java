package core.designPatterns.adapter;

public class EmployeeAdapter implements Person {

    Employee employee;

    public EmployeeAdapter(Employee employee) {
        this.employee = employee;
    }


    @Override
    public String getName() {
        return employee.getEmployeeName();
    }

    @Override
    public String getEmail() {
        return employee.getGetEmployeeEmail();
    }
}
