import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Assignments {

    String title;
    LocalDate deadline;

    Map<Student, String> normalSubmissions = new HashMap<>();
    Map<Student, String> lateSubmissions = new HashMap<>();
    Map<Student, Integer> grades = new HashMap<>();

    public Assignments(String title, LocalDate deadline) {
        this.title = title;
        this.deadline = deadline;
    }
    public void submit(Student student, String work, LocalDate submissionDate) {
        if (submissionDate.isAfter(deadline)) {
            System.out.println("Late submission by " + student.name);
            lateSubmissions.put(student, work);
        } else {
            normalSubmissions.put(student, work);
        }
    }
    public void DoGradingForOnTime() {
        for (Student s : normalSubmissions.keySet()) {
            Grading(s, 10);
        }
    }
    public void DoGradingForLate() {
        for (Student s : lateSubmissions.keySet()) {
            Grading(s, 8);
        }
    }
    public void ShowGrades() {
        for (var v : grades.entrySet()) {
            System.out.println(v.getKey().name + " -> " + v.getValue());
        }
    }
    public void Grading(Student student, int marks) {
        grades.put(student, marks);
    }
}
