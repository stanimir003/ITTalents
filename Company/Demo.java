package Company;

public class Demo {

    public static void main(String[] args) {

        Company BG = new Company("BG");
        Employee pepi = new Employee("pepi" , 34,235.2);
        Employee gepi = new Employee("gepi" , 45,2356.2);
        Employee heepi = new Employee("hepi" , 14,255.2);
        Employee repi = new Employee("repi" , 24,23611.2);

        BG.addRabotnik(pepi,"IT");
        BG.addRabotnik(gepi,"ku");
        BG.addRabotnik(repi,"HH");
        BG.addRabotnik(heepi,"IT");

        BG.printWorkuurs();
        BG.sortedBySalary();
        BG.sortedByAge();
        BG.sortedByName();

    }

}
