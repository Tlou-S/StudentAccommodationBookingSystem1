package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    void createStudent() {
        Student student = StudentFactory.createStudent("230830811", "Sethu Mdluli", GenderType.MALE,new Address(),new ContactDetails());
        assertNotNull(student);
        System.out.println(student);
    }
}