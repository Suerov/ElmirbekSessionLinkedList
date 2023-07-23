import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);
        Scanner numbers = new Scanner(System.in);
        LinkedList<Course> courses = new LinkedList<>();
        courses.add(new Course(9, "Java", "Kochkor-Ata"));
        courses.add(new Course(9, "JavaScrip", "Kochkor-Ata"));
        courses.add(new Course(9, "Python", "Kochkor-Ata"));
        courses.add(new Course(12, "C++", "Kochkor-Ata"));
        System.out.println(courses);
        while (true) {
            System.out.print("Choose one course: ");
            String name = words.nextLine();
            for (Course course : courses) {
                if (Objects.equals(course.getName(), name)) {
                    System.out.println("Name: " + course.getName() + "\n" + "Duration: " + course.getDreition() + "\n" + "Location: " + course.getLocaition() + "\n" + "count off Students: " + course.getStudents().size());
                    System.out.println("Add students:");
                    int a = numbers.nextInt();
                    for (int i = 0; i < a; i++) {
                        System.out.println("Write name:");
                        String names = words.nextLine();
                        System.out.println("Write age:");
                        int ages = numbers.nextInt();
                        System.out.println("Student succesfully saved!");
                        course.addStudentToList(new Student(names, ages));
                    }
                }
            }
        }
    }
}