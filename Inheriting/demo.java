package Inheriting;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person [] arr = new Person[10];

     /*   for (int i = 0; i <arr.length ; i++) {
            System.out.println("vuvedete ime ");
            String name = scanner.next();
            System.out.println("vuvedete godini ");
            int age = scanner.nextInt();
            System.out.println("dali e muj ");
            boolean isMale = scanner.nextBoolean();
            arr[i] = new Person(name,age,isMale);
        }
*/
       Person Gosho =new Person("Gosho", 17,true);
        Person Tosho =new Person("Tosho", 34,true);
        Employee Shosho =new Employee("Shosho", 22,true,100);
       Employee Goshka =new Employee("Goshka", 55,false,150);
        Student SkubiDu =new Student("SkubiDu", 19,true,4.56);
        Student Shagi =new Student("Shagi", 19,true,5.15);

        Person[] array = new Person[6];


           array[0] = new Employee("Shosho", 22,true,100);
            array[1] = new Employee("Goshka", 55,false,150);
            array[2] = new Student("SkubiDu", 19,true,4.56);
            array[3] = new Student("Shagi", 19,true,5.15);
            array[4] = new Person("Gosho", 17,true);
            array[5] = new Person("Tosho", 34,true);

        for (int i = 0; i <array.length ; i++) {
            if (array[i].getClass().equals(Student.class)){
                ((Student) array[i]).showStudentInfo();
            }
            if (array[i].getClass().equals(Person.class)){
                ((Person) array[i]).showPersonInfo();
            }
            if (array[i].getClass().equals(Employee.class)){
                ((Employee) array[i]).calculateOverTime(2);
                ((Employee) array[i]).showEmployeeInfo();
            }
        }


      // Shosho.calculateOverTime(10);
       // Shosho.showEmployeeInfo();

      // Shagi.showStudentInfo();




    }
}
