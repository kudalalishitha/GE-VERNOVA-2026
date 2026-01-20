import java.time.LocalDate;
import java.util.*;

public class Course {

    int CourseId;
    String CourseName;
    Instructor instructor;
    Set<Student> pendingRequests = new HashSet<>();
    Set<Student> approvedRequests = new HashSet<>();
    List<Assignments> assignments = new ArrayList<>();

    public Course(int id, String name, Instructor instructor) {
        this.CourseId = id;
        this.CourseName = name;
        this.instructor = instructor;
    }

    public void RequestEnrollment(Student student) {
        if (approvedRequests.contains(student)) {
            System.out.println(student.name + " already approved");
            return;
        }
        if (pendingRequests.add(student)) {
            System.out.println(student.name + " requested approval");
        } else {
            System.out.println("Duplicate registration request");
        }
    }

    public void ApproveEnrollment(Student student) {
        if (pendingRequests.remove(student)) {
            approvedRequests.add(student);
            System.out.println("Enrollment approved for " + student.name);
        }
    }

    public void RejectEnrollment(Student student) {
        if (pendingRequests.remove(student)) {
            System.out.println("Enrollment rejected for " + student.name);
        }
    }

    public Assignments GenerateAssignment(String title, LocalDate deadline) {
        Assignments a = new Assignments(title, deadline);
        assignments.add(a);
        return a;
    }
    public void seeRequestsForApproval() {
        for (Student s : pendingRequests) {
            System.out.println(s.id + " -> " + s.name);
        }
    }
}
