// Another subclass derived directly from Employee
class AdministrativeOfficer extends Employee {
    String officeSection;

    AdministrativeOfficer(String memberId, String name, double salary, String officeSection) {
        super(memberId, name, salary);
        this.officeSection = officeSection;
    }

    void handlePaperwork() {
        System.out.println(name + " is handling paperwork in " + officeSection + " section.");
    }

    @Override
    void performDuty() {
        System.out.println(name + " is managing administrative tasks in " + officeSection + " section.");
    }
}
