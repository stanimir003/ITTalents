package Company;

import Collection.ComparatorByName;
import Company.Comparators.ComparatorByAge;
import Company.Comparators.CompareBySalary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Company {

    String name;
    HashMap<String,HashSet<Employee>> rabotnici;

    public Company(String name) {
        this.name = name;
        rabotnici = new HashMap<>();
    }

    void addRabotnik(Employee employee,String department){
        if (!this.rabotnici.containsKey(department)){
            this.rabotnici.put(department,new HashSet<Employee>());
        }
        this.rabotnici.get(department).add(employee);
    }
    void printWorkuurs(){
        for(String dep : rabotnici.keySet()){
            System.out.println(dep);
            for(Employee e : rabotnici.get(dep)){
                System.out.println("   " + e);
            }
        }
    }
    void sortedBySalary(){
        CompareBySalary comparator = new CompareBySalary();
        TreeSet<Employee> set = new TreeSet(comparator) ;

        for(HashSet<Employee> innerSet : rabotnici.values()){
                set.addAll(innerSet);
        }
        for(Employee e : set){
            System.out.println(e);
        }

    }
    void sortedByAge(){
        ComparatorByAge comparator = new ComparatorByAge();
        TreeSet<Employee> set = new TreeSet<>(comparator);
        for(HashSet<Employee> innerSet : rabotnici.values()){
            set.addAll(innerSet);
        }
        for(Employee e : set){
            System.out.println(e);
        }
    }
    void sortedByName(){
        ComparatorByName comparator = new ComparatorByName();
        TreeSet<Employee> set = new TreeSet<>(comparator);

        for(HashSet<Employee> innerSet : rabotnici.values()){
            set.addAll(innerSet);
        }
        for(Employee e : set){
            System.out.println(e);
        }
    }
}
