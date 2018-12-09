package Inheriting ;

public class Student extends Person {

   protected double score;


    public Student(String name, int age, boolean isMale,double score) {
        super(name, age, isMale);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public void showStudentInfo() {
        super.showPersonInfo();
        System.out.println(this.name + " Има успех -  " + this.score);
    }
}
