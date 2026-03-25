package za.ac.cput;


import za.ac.cput.domain.*;
import za.ac.cput.factory.*;


public class Main {
    public static void main(String[] args) {

        ContactDetails contactDetails = new ContactDetails.Builder()
                .setStudentEmail("sethu@gmail.com")
                .setPhone("0824537952")
                .build();

        Address address = new Address.Builder()
                .setPostalCode("741B")
                .setCity("Hazyview")
                .setStreet("Salubindza")
                .build();

        Student student = StudentFactory.createStudent(
                "230830811",
                "Sethu Mdluli",
                GenderType.MALE,
                address,
                contactDetails
        );
        System.out.println(student);
    }
}