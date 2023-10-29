

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("mark", 1, new int[]{78});
        Student stud2 = new Student("jackson", 2, new int[]{87});
        Teacher teach1 = new Teacher("mr.Dominic peter","advanced java");
        College college =new College("informarics", new ArrayList<Student>(), new ArrayList<Teacher>());

        college.getStudents().add(stud1);
        college.getStudents().add(stud2);
        college.getTeachers().add(teach1);


        college.displayStudents();
        college.displayTeachers();


    }

}