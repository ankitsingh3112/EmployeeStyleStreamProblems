import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestPaid {

    public Optional<Employee> getHighestPaid(List<Employee> employees) {
      return  employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
    }
}
