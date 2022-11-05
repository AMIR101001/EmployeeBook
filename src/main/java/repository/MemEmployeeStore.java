package repository;

import model.Employee;

public class MemEmployeeStore {

    private Employee[] employees  = new Employee[1000];

    private int index = 0;

    public Employee save (Employee employee){
        employees[index] = employee;

        return employee;
    }

    public Employee[] findAllByName(String name){
        return null;
    }

    public boolean update (long id, Employee employee){
        return true;
    }

    public boolean delete (long id){
        return true;
    }

    public boolean delete (String contru){
        return true;
    }

    public Employee[] findAll(){
        return employees;
    }

    public Employee finById(long id){
        for(Employee employee : employees){
            if(employee.getId() == id){
                return employee;
            }
            return null;
        }
        return null;
    }
}
