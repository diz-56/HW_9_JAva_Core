package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Course> courses1 = List.of(new CourseImpl("1"), new CourseImpl("2"));
        List<Course> courses2 = List.of(new CourseImpl("2"), new CourseImpl("3"), new CourseImpl("4"));
        List<Course> courses3 = List.of(new CourseImpl("1"), new CourseImpl("5"));
        List<Course> courses4 = List.of(new CourseImpl("6"), new CourseImpl("7"), new CourseImpl("8"), new CourseImpl("9"), new CourseImpl("10"));
        List<Course> courses5 = List.of(new CourseImpl("11"));

        List<Student> students = List.of(new StudentImpl("Ivan", courses1), new StudentImpl("Petya", courses2), new StudentImpl("Dima", courses3), new StudentImpl("Vasya", courses4), new StudentImpl("Edgar", courses5));

        System.out.println(findInquisitiveStudents(students));
    }


    private static List<Course> getUniqCoursesByStudents(List<Student> students) {
        return students.stream().flatMap(student -> student.getAllCourses().stream()).distinct().collect(Collectors.toList());
    }

    private static List<Student> findInquisitiveStudents(List<Student> students) {
        return students.stream().sorted((st1, st2) -> st2.getAllCourses().size() - st1.getAllCourses().size()).limit(3).collect(Collectors.toList());
    }

    private static List<Student> findStudentsAttendingCourse(List<Student> students, Course course) {
        return students.stream().filter(student -> student.getAllCourses().contains(course)).collect(Collectors.toList());
    }

}
