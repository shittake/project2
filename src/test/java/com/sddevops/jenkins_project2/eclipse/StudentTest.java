package com.sddevops.jenkins_project2.eclipse;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void testConstructorWithoutBestFriend() {
        Student s = new Student(1, "Alice", LocalDate.of(2025, 1, 1));
        assertEquals(s.getName(), "Bob"); // this should fail
    }
}