package com.sddevops.jenkins_project2.eclipse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassGroupTest {

    @Test
    void testConstructor() {
        int capacity = 5;
        ClassGroup group = new ClassGroup(capacity);

        assertEquals(capacity, 4); // this should fail
    }
}