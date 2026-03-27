package za.ac.cput.factory;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AccomodationFactoryTest {

    @Test
    void createAccomodation() {

        Address address = new Address.Builder()
                .setPostalCode("7410")
                .setCity("Cape Town")
                .setStreet("WoodStock")
                .build();

        Accomodation accomodation = AccomodationFactory.createAccomodation(

                address,
                AccomodationStatus.OCCUPIED
        );

        assertNotNull(accomodation);
        System.out.println(accomodation);
    }
}