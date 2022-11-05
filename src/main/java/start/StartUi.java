package start;

import model.Employee;

public class StartUi {

    public static void Main(String args) {
        Employee employee = new Employee("Amir", "Russia");

        System.out.println(employee.getCountry());
        System.out.println(employee.getName());


    }
}
