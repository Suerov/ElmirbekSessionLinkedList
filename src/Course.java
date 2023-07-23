import java.util.LinkedList;

public class Course {
    private int  dreition;
    private String name;
    private  String locaition;
    LinkedList<Student>students=new LinkedList<>();

    public Course(int  dreition, String name, String locaition) {
        this.dreition = dreition;
        this.name = name;
        this.locaition = locaition;
        this.students = students;
    }


    public int  getDreition() {
        return dreition;
    }

    public void setDreition(int dreition) {
        this.dreition = dreition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocaition() {
        return locaition;
    }

    public void setLocaition(String locaition) {
        this.locaition = locaition;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }
    public void addStudentToList(Student newStudent){
        students.add(newStudent);
    }

    @Override
    public String toString() {
        return "Course{" +
                "dreition='" + dreition + '\'' +
                ", name='" + name + '\'' +
                ", locaition='" + locaition + '\'' +
                ", students=" + students +
                '}';
    }
}
