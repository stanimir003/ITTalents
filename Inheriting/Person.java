package Inheriting;

import java.sql.Array;

public class Person {
    public String name;
    public int age;
    public boolean isMale;

    Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

   public   void showPersonInfo(){
       System.out.println("Името на човека е " + this.name + " на " + this.age +" години." + " Мъж ли е - " + this.isMale );
    }


}
