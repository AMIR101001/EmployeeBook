package repository;

import model.Employee;
import org.junit.Assert;
import org.junit.Test;

public class MemEmployeeStoreTest {
    @Test
    public void whenSave(){
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee = new Employee("Amir", "Russia");
        employeeRepository.save(employee);
        Employee result = employeeRepository.finById(employee.getId());
        Assert.assertNotNull(result);
    }

}