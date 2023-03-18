abstract class Human {
    private String name;
    private int yearOfBirth;
    private double salary;
    Human(String name, int yearOfBirth, double salary) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public double getSalary() {
        return salary;
    }
    public abstract void printInfo();
}

class Director extends Human {
    Director(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth, salary);
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Year of birth: " + getYearOfBirth());
        System.out.println("Salary: " + getSalary());
    }
    public void manage() {
        System.out.println("I'm managing the company.\n");
    }
}

class DepartmentHead extends Human {
    DepartmentHead(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth, salary);
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Year of birth: " + getYearOfBirth());
        System.out.println("Salary: " + getSalary());
    }
    public void manageDepartment() {
        System.out.println("I'm managing a department.\n");
    }
}

class Worker extends Human {
    Worker(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth, salary);
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Year of birth: " + getYearOfBirth());
        System.out.println("Salary: " + getSalary());
    }
    public void doWork() {
        System.out.println("I'm doing my job.");
    }
}

public class Main {
    public static void main(String[] args) {
        Director director = new Director("John Smith", 1965, 100000);
        director.printInfo();
        director.manage();

        DepartmentHead head = new DepartmentHead("Jane Doe", 1978, 70000);
        head.printInfo();
        head.manageDepartment();

        Worker worker = new Worker("Bob Johnson", 1995, 30000);
        worker.printInfo();
        worker.doWork();
    }
}