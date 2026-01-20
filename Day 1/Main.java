import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student lishitha = new Student(1, "Lishitha");
        Student blessy = new Student(2, "Blessy");
        Student sanjana = new Student(3, "Sanjana");

        Instructor guide = new Instructor(1, "Guide");
        Course collections = new Course(301, "Collections Lab", guide);

        Student[] group = { lishitha, blessy, sanjana };
        for (Student s : group) {
            collections.RequestEnrollment(s);
        }

        System.out.println("\nPending before approval:");
        collections.seeRequestsForApproval();

        collections.ApproveEnrollment(lishitha);
        collections.ApproveEnrollment(sanjana);
        collections.RejectEnrollment(blessy);

        System.out.println("\nPending after approval:");
        collections.seeRequestsForApproval();

        Assignments lab = collections.GenerateAssignment("Collections Practice", LocalDate.now());

        lab.submit(lishitha, "Completed with HashMap", LocalDate.now());
        lab.submit(sanjana, "Used ArrayList & Set", LocalDate.now().plusDays(1));

        lab.DoGradingForOnTime();
        lab.DoGradingForLate();

        System.out.println("\nFinal Grades:");
        lab.ShowGrades();

        LiveSessions session = new LiveSessions("Collections Doubt Session");

        session.sendMessage("Guide", "Welcome to the live session");
        session.sendMessage("Lishitha", "Can you explain HashMap again?");
        session.sendMessage("Sanjana", "Difference between List and Set?");
        session.sendMessage("Guide", "Sure, I will explain with examples");

        session.showChat();
    }
}
