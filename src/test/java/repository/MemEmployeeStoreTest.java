package repository;

import model.Employee;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemEmployeeStoreTest {
    @Test
    public void whenSave(){
        MemEmployeeStore memEmployeeStore = new MemEmployeeStore();
        Employee employee = new Employee("Amir", "Russia");
        memEmployeeStore.save(employee);
        Employee result = memEmployeeStore.finById(employee.getId());
        Assert.assertNotNull(result);
    }

}