package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    void createStudent() {

        ContactDetails contactDetails = new ContactDetails.Builder()
                .setStudentEmail("sethu@gmail.com")
                .setPhone("0824537952")
                .build();

        Address address = new Address.Builder()
                .setPostalCode("741B")
                .setCity("Hazyview")
                .setStreet("Salubindza")
                .build();


        Student student = StudentFactory.createStudent("230830811", "Sethu Mdluli", GenderType.MALE, address, contactDetails);
        assertNotNull(student);
        System.out.println(student);
    }
}