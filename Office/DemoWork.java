package Office;

import Office.AllWork;
import Office.Task;

public class DemoWork {
    public static void main(String[] args) {

        AllWork work = new AllWork();

        Task one = new Task("g",4);
        Task two = new Task("gg",5);
        Task Three = new Task("ggg",2);
        Task four = new Task("gggg",1);
        Task five = new Task("ggggg",7);
        Task six = new Task("gggggg",11);
        Task seven = new Task("gggg",9);
        Task eight = new Task("ggg",42);
        Task nine = new Task("ggg",6);
        Task ten = new Task("ggggggg",4);

        work.addTask(one);
        work.addTask(two);
        work.addTask(Three);
        work.addTask(four);
        work.addTask(five);
        work.addTask(six);
        work.addTask(seven);
        work.addTask(eight);
        work.addTask(nine);
        work.addTask(ten);

        Employee Gosho = new Employee("Gosho");
        Gosho.setAllWork(work);
        Employee Ivan = new Employee("Ivan");
        Ivan.setAllWork(work);
        Employee Peggi = new Employee("Peggi");
        Peggi.setAllWork(work);
        boolean ready =false;
        do {
            if (Gosho.hoursLeft == 0 && Ivan.hoursLeft == 0 && Peggi.hoursLeft == 0) {
                Gosho.startWorkingDay();
                Ivan.startWorkingDay();
                Peggi.startWorkingDay();
                System.out.println("Стартира нов ден");
            }
            if (Gosho.hoursLeft > 0) {
                Gosho.work();
            }

            if (Ivan.hoursLeft > 0) {
                Ivan.work();
            }
            if (Peggi.hoursLeft > 0) {
                Peggi.work();
            }
            for (int i = 0; i <work.tasks.length ; i++) {
                if (work.tasks[i].workingHours ==0){
                    ready = true;
                }
                else{
                    ready = false;
                    break;
                }
            }

        }while(ready == false);

    }
}
