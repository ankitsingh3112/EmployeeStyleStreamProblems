import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Employee {
    private final int id;
    private final String name;
    private final String dept;
    private final double salary;
    private final int age;
    private final String gender;
    private final LocalDate joiningDate;
    public Employee(int id, String name, String dept, double salary, int age,
                    String gender, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.joiningDate = joiningDate;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public LocalDate getJoiningDate() { return joiningDate; }
    @Override
    public String toString() { return name + ":" + (long) salary + ":" + dept; }

    public static List<Employee> sample(){
        return Arrays.asList(
                new Employee(1, "Asha", "IT", 95000, 32, "F", LocalDate.of(2019, 3, 15)),
                new Employee(2, "Ravi", "IT", 120000, 38, "M", LocalDate.of(2016, 7, 1)),
                new Employee(3, "Neha", "HR", 60000, 29, "F", LocalDate.of(2021, 1, 10)),
                new Employee(4, "Karan", "Finance", 85000, 45, "M", LocalDate.of(2014, 11, 20)),
                new Employee(5, "Priya", "Finance", 110000, 41, "F", LocalDate.of(2017, 5, 5)),
                new Employee(6, "Vikram", "IT", 70000, 26, "M", LocalDate.of(2022, 8, 18)),
                new Employee(7, "Sneha", "HR", 70000, 35, "F", LocalDate.of(2018, 2, 28)),
                new Employee(8, "Arjun", "Ops", 55000, 30, "M", LocalDate.of(2023, 4, 1)));
    }

}
