package Inheriting;

public class Employee extends Person {

    protected double daySalary;
    protected double overTime = 0;

    public Employee(String name, int age, boolean isMale, double daySalary) {
        super(name, age, isMale);
        this.daySalary = daySalary;
    }

    public double getDaySalary() {
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

    void calculateOverTime(double hours){
        if (this.age < 18){
            this.daySalary = 0;
        }
        else {
        overTime = ((this.daySalary/8) * 1.5) * hours;
        }
        System.out.println("Дължимата сума  на " + this.name + " за извънработно време  e " + + overTime);

    }


    public void showEmployeeInfo() {
        super.showPersonInfo();
        System.out.println( "дневната заплата на " + this.name + " e "+((this.daySalary) + overTime));
    }
}