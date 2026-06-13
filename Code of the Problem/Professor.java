// Level 3 of multilevel inheritance
class Professor extends AcademicStaff {
    String researchArea;
    int numberOfPublications;
    double researchGrant;

    Professor(String memberId, String name, double salary, String department,
               String researchArea, int numberOfPublications, double researchGrant) {
        super(memberId, name, salary, department);
        this.researchArea = researchArea;
        this.numberOfPublications = numberOfPublications;
        this.researchGrant = researchGrant;
    }

    // Professor-specific method (not in superclass)
    void showResearchProfile() {
        System.out.println("---- Research Profile of " + name + " ----");
        System.out.println("Research Area: " + researchArea);
        System.out.println("Publications: " + numberOfPublications);
        System.out.println("Research Grant: " + researchGrant);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is conducting research in " + researchArea + " and teaching.");
    }
}
