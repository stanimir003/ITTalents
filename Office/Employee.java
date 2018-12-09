package Office;

public class Employee {

   // protected double daySalary;
   // protected double overTime = 0;
    protected String name;
    protected Task currentTask;
    protected int hoursLeft;
    protected AllWork allWork;

    Employee(String name){

    }

  /*  public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }
*/
    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentTask(Task currentTask) {
        this.currentTask = currentTask;
    }

    public void setAllWork(AllWork allWork) {
        this.allWork = allWork;
    }

    public  String getName() {

        return this.name;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    public AllWork getAllWork() {
        return allWork;
    }

    public void setHoursLeft(int hoursLeft) {
        this.hoursLeft = hoursLeft;
    }

    void startWorkingDay(){
        this.hoursLeft = 8;
    }

    void work( ){
        if (this.hoursLeft >0 ) {
            allWork.getNextTask();
            if (this.hoursLeft > allWork.tasks[allWork.currentUnassignedTasks].workingHours) {
                this.hoursLeft -= allWork.tasks[allWork.currentUnassignedTasks].workingHours;
                allWork.tasks[allWork.currentUnassignedTasks].workingHours = 0;
                System.out.println("на работника му остават " + this.hoursLeft + "'работни часове");
            }
            else{
                allWork.tasks[allWork.currentUnassignedTasks].workingHours -=this.hoursLeft;
                this.hoursLeft=0;
                System.out.println("от задачата остават " + allWork.tasks[allWork.currentUnassignedTasks].workingHours + " часа");
            }

        }
        }
    }



