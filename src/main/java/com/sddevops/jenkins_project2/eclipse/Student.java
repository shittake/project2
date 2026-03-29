package com.sddevops.jenkins_project2.eclipse;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Student {

    private int id;
    private String name;
    private LocalDate birthday;
    private Student friend; // can be null if don't have any best friend

    public Student(int id, String name, LocalDate birthday, Student friend) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.friend = friend;
    }

    public Student(int id, String name, LocalDate birthday) {
        this(id, name, birthday, null);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Student getFriend() {
        return friend;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setFriend(Student friend) {
        this.friend = friend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name) &&
                Objects.equals(birthday, student.birthday);
        // friend is NOT included to avoid circular comparison issues
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthday);
    }

    public static Comparator<Student> compareByName = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareToIgnoreCase(s2.getName());
        }
    };

    public static Comparator<Student> compareByBirthday = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getBirthday().compareTo(s2.getBirthday());
        }
    };

    @Override
    public String toString() {
        return "Student{id = " + id +
                ", name = '" + name + '\'' +
                ", birthday = " + birthday +
                ", friend = " + (friend != null ? friend.name : "no best friend") +
                '}';
    }
}