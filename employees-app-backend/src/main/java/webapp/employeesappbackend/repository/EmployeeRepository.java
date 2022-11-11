package webapp.employeesappbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.employeesappbackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
