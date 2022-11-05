package repository;

import model.Employee;

import java.util.Objects;

public class EmployeeRepository {

    private Employee[] employees  = new Employee[10];

    private int index = 0;

    public Employee save (Employee employee){
        if(employees.length - 1 == index){
            System.out.println("Book size is max");
            employee.setId(-1);
            return employee;
        }else {
            employees[index] = employee;
            index++;
            return employee;
        }
    }

    public Employee[] findAllByName(String name){
        return null;
    }

    public boolean update (long id, Employee employee){
        for(int i = 0; i < employees.length; i++){

            long employeeId = employees[i].getId();

            if(employeeId == id){
                employee.setId(employeeId);
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public boolean delete(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                index--;
                return true;
            }
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employees[i + 1];
                employees[i + 1] = null;
            }
        }
        return false;
    }

    public boolean delete (String contru){
        return true;
    }

    public Employee[] findAll(){
        int count = 0;
        for(Employee employee : employees){
            if(Objects.nonNull(employee)){
                count++;
            }
        }

        Employee[] result = new Employee[count];

        for(Employee employee : employees){
            if(Objects.nonNull(employee)){
                count--;
                result[count] = employee;
            }
        }
        return result;
    }

    public Employee finById(long id){
        for(Employee employee : employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
}
