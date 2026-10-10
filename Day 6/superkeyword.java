
class employee {
    double salary = 30000;
}

class manager extends main {
    double salary = 60000;

    void displaysalary() {
        System.out.println("manager salary " + salary);
        System.out.println("employee salary " + super.salary);
    }
}

public class superkeyword {
    public static void main(String[] args) {
        manager m = new manager();
        m.displaysalary();
    }
}