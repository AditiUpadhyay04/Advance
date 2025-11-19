class Employeeee {
    private String id;
    private double salary;

    public void setId(String id) {
        this.id = id;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public String getId() { return id; }
    public double getSalary() { return salary; }
}

public class Main2 {
    public static void main(String[] args) {
        Employeeee Emp = new Employeeee();
        Emp.setId("EMP101");
        Emp.setSalary(45000);

        System.out.println(Emp.getId());
        System.out.println(Emp.getSalary());
    }
}
