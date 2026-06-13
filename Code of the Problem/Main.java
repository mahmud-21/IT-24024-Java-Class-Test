import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Collection of UniversityMember (Abstract type)
        ArrayList<UniversityMember> members = new ArrayList<>();

        // Sample data
        members.add(new Professor("P01", "Dr. Karim", 150000, "CSE", "Machine Learning", 25, 500000));
        members.add(new AdministrativeOfficer("A01", "Mr. Rahim", 40000, "Admission"));
        members.add(new AcademicStaff("AS01", "Ms. Nila", 60000, "Physics"));
        members.add(new Employee("E01", "Mr. Sajid", 35000));

        System.out.println("===== Basic Info & Duties (Dynamic Binding) =====");
        for (UniversityMember member : members) {
            member.displayBasicInfo();
            member.performDuty();   // Runtime polymorphism - correct overridden method called
            System.out.println();
        }

        System.out.println("===== Downcasting: Professor-specific info =====");
        for (UniversityMember member : members) {
            if (member instanceof Professor) {
                Professor p = (Professor) member;   // Safe downcasting
                p.showResearchProfile();
                System.out.println();
            }
        }
    }
}
