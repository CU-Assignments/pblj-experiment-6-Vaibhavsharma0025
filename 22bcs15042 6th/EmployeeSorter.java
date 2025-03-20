import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age + ", Salary: " + salary;
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 25, 50000));
        employees.add(new Employee("Bob", 30, 60000));
        employees.add(new Employee("Charlie", 28, 55000));

        // Sorting by salary using lambda expression
        employees.sort(Comparator.comparingDouble(emp -> emp.salary));
        
        System.out.println("Employees sorted by Salary:");
        employees.forEach(System.out::println);
    }
}