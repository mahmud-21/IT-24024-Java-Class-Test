// Level 2 of multilevel inheritance
class AcademicStaff extends Employee {
    String department;

    AcademicStaff(String memberId, String name, double salary, String department) {
        super(memberId, name, salary);
        this.department = department;
    }

    void showDepartment() {
        System.out.println(name + " belongs to " + department + " department.");
    }

    @Override
    void performDuty() {
        System.out.println(name + " is teaching students in " + department + " department.");
    }
}
