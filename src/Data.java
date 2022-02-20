import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {
    public static List<Student> getStudentList() {
        Course course1 = new Course("История");
        Course course2 = new Course("Дизайн");
        Course course3 = new Course("Программирование");
        Course course4 = new Course("Психология");
        Course course5 = new Course("Филология");



        Student student1 = new Student("Студент_1", Arrays.asList(course1, course2, course5));
        Student student2 = new Student("Студент_2", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Студент_3", Arrays.asList(course1, course4));
        Student student4 = new Student("Студент_4", Arrays.asList(course1, course2, course3, course4, course5));
        Student student5 = new Student("Студент_5", Arrays.asList(course3, course5, course1));
        Student student6 = new Student("Студент_6", Arrays.asList(course1, course3, course5, course4));
        Student student7 = new Student("Студент_7", Arrays.asList(course2, course3, course4, course5));
        Student student8 = new Student("Студент_8", Arrays.asList(course3, course2, course4));
        Student student9 = new Student("Студент_9", Arrays.asList(course4, course5));
        Student student10 = new Student("Студент_10", Arrays.asList(course5, course1, course4));
        
        
        return Arrays.asList(student1, student2, student3, student4, student5, 
                student6, student7, student8, student9, student10);
        
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }
        private static List<Course> getListCourses() {
            return Arrays.asList(new Course("История"), 
                    new Course("Дизайн"),
                    new Course("Программирование"), 
                    new Course("Психология"),
                    new Course("Филология"));
        }


}
