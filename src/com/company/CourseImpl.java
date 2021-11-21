package com.company;

import java.util.Objects;

public class CourseImpl implements Course {

    private String name;

    public CourseImpl(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseImpl course = (CourseImpl) o;
        return Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CourseImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
