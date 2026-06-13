// Level 1 of multilevel inheritance
class Employee extends UniversityMember {
    double salary;

    Employee(String memberId, String name, double salary) {
        super(memberId, name);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(name + "'s Salary: " + salary);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is performing general employee duties.");
    }
}
