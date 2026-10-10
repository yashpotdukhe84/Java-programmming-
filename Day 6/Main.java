
class main {
    String name;
    double salary;

    main(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends employee {
    String dept;

    Manager(String name, double salary, String dept) {
        super(name, salary);
        this.dept = dept;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + dept);
        System.out.println("Role: Manager");
    }
}

public class Main {
    public static void main(String[] args) {
        manager m = new manager("Yash", 50000, "IT");
        m.displayInfo();
    }
}