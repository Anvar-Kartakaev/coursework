public class Employee {
    private int id;
    private static int count;
    private String name;
    private String department;
    private float salary;

    public Employee(String name, String department, float salary) {
        id = ++count;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Employee otherEmployee = (Employee) other;
        return id == (otherEmployee.id) && name.equals(otherEmployee.name) && department.equals(otherEmployee.department) && salary == (otherEmployee.salary);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getId(), getName(), getDepartment(), getSalary());
    }

    @Override
    public String toString() {
        return getId() + ". " + getName() + ", отдел '" + getDepartment() + "', зарплата: " + getSalary() + " рублей.";
    }



}
