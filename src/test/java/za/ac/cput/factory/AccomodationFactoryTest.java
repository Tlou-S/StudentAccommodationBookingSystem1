package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Accomodation;
import za.ac.cput.domain.AccomodationStatus;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.GenderType;


import static org.junit.jupiter.api.Assertions.*;

class AccomodationFactoryTest {

    @Test
    void createAccomodation() {

        Address address = new Address.Builder()
                .setPostalCode("7410")
                .setCity("Cape Town")
                .setStreet("WoodStock")
                .build();

        Accomodation accomodation = AccomodationFactory.createAccomodation("123", "NMJ", GenderType.FEMALE,"885427452",address, AccomodationStatus.AVAILABLE);

        assertNotNull(accomodation);
        System.out.println(accomodation);
    }
}