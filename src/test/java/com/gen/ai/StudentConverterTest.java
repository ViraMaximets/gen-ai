package com.gen.ai;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentConverterTest {

    @Test
    void testConvertStudents_Case1() {
        // Arrange: Create a list with a student object meeting the criteria
        List<Student> students = new ArrayList<>();
        Student honorRollStudent = new Student();
        honorRollStudent.setName("Alice");
        honorRollStudent.setAge(21);
        honorRollStudent.setGrade(95);
        students.add(honorRollStudent);

        // Act: Call the convertStudents method
        StudentConverter converter = new StudentConverter();
        List<Student> convertedStudents = converter.convertStudents(students);

        // Assert: Check if the conversion worked as expected
        assertEquals(1, convertedStudents.size());

        Student convertedStudent = convertedStudents.get(0);
        assertFalse(convertedStudent.isExceptional());
        assertTrue(convertedStudent.isHonorRoll());
        assertFalse(convertedStudent.isPassed());
    }

    @Test
    void testConvertStudents_Case2() {
        // Arrange: Create a list with a student object meeting the criteria
        List<Student> students = new ArrayList<>();
        Student exceptionalStudent = new Student();
        exceptionalStudent.setName("John");
        exceptionalStudent.setAge(20);
        exceptionalStudent.setGrade(95);
        students.add(exceptionalStudent);

        // Act: Call the convertStudents method
        StudentConverter converter = new StudentConverter();
        List<Student> convertedStudents = converter.convertStudents(students);

        // Assert: Check if the conversion worked as expected
        assertEquals(1, convertedStudents.size());

        Student convertedStudent = convertedStudents.get(0);
        assertTrue(convertedStudent.isExceptional());
        assertFalse(convertedStudent.isHonorRoll());
        assertFalse(convertedStudent.isPassed());
    }

    @Test
    void testConvertStudents_Case3() {
        // Arrange: Create a list with a student object meeting the criteria
        List<Student> students = new ArrayList<>();
        Student passedStudent = new Student();
        passedStudent.setName("Bob");
        passedStudent.setAge(18);
        passedStudent.setGrade(85);
        students.add(passedStudent);

        // Act: Call the convertStudents method
        StudentConverter converter = new StudentConverter();
        List<Student> convertedStudents = converter.convertStudents(students);

        // Assert: Check if the conversion worked as expected
        assertEquals(1, convertedStudents.size());

        Student convertedStudent = convertedStudents.get(0);
        assertFalse(convertedStudent.isExceptional());
        assertFalse(convertedStudent.isHonorRoll());
        assertTrue(convertedStudent.isPassed());
    }

    @Test
    void testConvertStudents_Case4() {
        // Arrange: Create a list with a student object meeting the criteria
        List<Student> students = new ArrayList<>();
        Student notPassedStudent = new Student();
        notPassedStudent.setName("Carol");
        notPassedStudent.setAge(19);
        notPassedStudent.setGrade(60);
        students.add(notPassedStudent);

        // Act: Call the convertStudents method
        StudentConverter converter = new StudentConverter();
        List<Student> convertedStudents = converter.convertStudents(students);

        // Assert: Check if the conversion worked as expected
        assertEquals(1, convertedStudents.size());

        Student convertedStudent = convertedStudents.get(0);
        assertFalse(convertedStudent.isExceptional());
        assertFalse(convertedStudent.isHonorRoll());
        assertFalse(convertedStudent.isPassed());
    }

    @Test
    void testConvertStudents_EmptyList() {
        // Arrange: Create an empty list of students
        List<Student> students = new ArrayList<>();

        // Act: Call the convertStudents method
        StudentConverter converter = new StudentConverter();
        List<Student> convertedStudents = converter.convertStudents(students);

        // Assert: Check if the converted list is also empty
        assertEquals(0, convertedStudents.size());
    }

    @Test
    void testConvertStudents_NullInput() {
        // Arrange: Create a null input
        List<Student> students = null;

        // Act and Assert: Check if the function throws the expected exception
        StudentConverter converter = new StudentConverter();
        assertThrows(NullPointerException.class, () -> {
            converter.convertStudents(students);
        });
    }
}