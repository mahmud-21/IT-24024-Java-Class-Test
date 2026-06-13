// Abstract class - cannot be instantiated directly
abstract class UniversityMember {
    String memberId;
    String name;

    UniversityMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    void displayBasicInfo() {
        System.out.println("ID: " + memberId + ", Name: " + name);
    }

    // Abstract method - must be implemented by subclasses
    abstract void performDuty();
}
