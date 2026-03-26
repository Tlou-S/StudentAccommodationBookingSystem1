package za.ac.cput.repository;
/**
 * BookingRepositoryTest.java
 * Creating Test
 * Author: Tlou Masebe (230128521)
 * Date: 26 March 2026
 */

import org.junit.jupiter.api.*;
import za.ac.cput.domain.*;
import za.ac.cput.factory.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentRepositoryTest {
    private static IStudentRepository repository = StudentRepository.getInstance();
    private static Student student;

    @BeforeAll
    static void setUp() {

        ContactDetails contactDetails = new ContactDetails.Builder()
                .setStudentEmail("sethu@gmail.com")
                .setPhone("0824537952")
                .build();

        Address address = new Address.Builder()
                .setPostalCode("7410")
                .setCity("Cape Town")
                .setStreet("Main Road")
                .build();

        student = StudentFactory.createStudent(
                "230830811",
                "Sethu Mdluli",
                GenderType.MALE,
                address,
                contactDetails
        );
    }

    @Test
    void a_create() {
        Student created = repository.create(student);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Student read = repository.read(student.getStudentNumber());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Student updated = new Student.Builder()
                .copy(student)
                .setStudentName("Junior Mdluli")
                .build();

        Student result = repository.update(updated);
        assertNotNull(result);
        System.out.println("Updated: " + result);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete(student.getStudentNumber());
        assertTrue(deleted);
    }

    @Test
    void e_getAllStudents() {
        assertNotNull(repository.getAllStudents());
        System.out.println(repository.getAllStudents());
    }
}