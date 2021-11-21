package com.company;

import java.util.List;
import java.util.Objects;

public class StudentImpl implements Student {

    private String name;
    private List<Course> courses;

    public StudentImpl(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentImpl student = (StudentImpl) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courses);
    }

    @Override
    public String toString() {
        return "StudentImpl{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
