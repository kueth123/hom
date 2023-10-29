
import java.util.ArrayList;
import java.util.Arrays;

public class College {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public College(String name, ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addStudent(Student stud1) {
        students.add(stud1);
    }

    public void addTeacher(Teacher teach1) {
        teachers.add(teach1);
    }
    //displaying the objects of Student and Teacher class along with the college name
    public void displayStudents() {
        System.out.println("Students of " + name + " College:");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName() + ", grades: " +  Arrays.toString(student.getGrades()));
        }
    }
    public void displayTeachers() {
        System.out.println("Teachers of " + name + " College:");
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.getName() + ", subject: " + teacher.getSubject() );
        }
    }
}
