package start;

import actions.*;
import input.ConsoleInput;
import input.Input;
import service.EmployeeService;

public class StartUi {

    public void init (Input input, EmployeeService employeeService, EmployeeAction[] employeeAction){
        boolean isRunning = true;

        while(isRunning){
            showMenu(employeeAction);
            int select = (int)input.askLong("Select: ");
            if(select < 0 || select >= employeeAction.length){
                System.out.println("Wrong input, you can select: 0 ..." + (employeeAction.length - 1));
                continue;
            }
            EmployeeAction action = employeeAction[select];
            isRunning = action.execute(input, employeeService);
        }
    }

    private void showMenu (EmployeeAction[] employeeActions){

        System.out.println("Welcome. It is menu. ");

        for(int i = 0; i < employeeActions.length; i++){
            System.out.println(i + ". " + employeeActions[i].name());
        }
    }

    public static void Main(String args) {
        Input input = new ConsoleInput();
        EmployeeService employeeService = new EmployeeService();

        EmployeeAction[] action ={
                new CreateAction(),
                new FindAllAction(),
                new DeleteAction(),
                new ExitProgramAction()
        };

        new StartUi().init(input, employeeService, action);
    }
}
