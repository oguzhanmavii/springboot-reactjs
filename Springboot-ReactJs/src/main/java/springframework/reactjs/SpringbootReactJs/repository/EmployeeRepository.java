package springframework.reactjs.SpringbootReactJs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springframework.reactjs.SpringbootReactJs.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
