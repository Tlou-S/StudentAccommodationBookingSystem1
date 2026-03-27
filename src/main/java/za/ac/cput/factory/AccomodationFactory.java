package za.ac.cput.factory;

import za.ac.cput.domain.Accomodation;
import za.ac.cput.domain.AccomodationStatus;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.GenderType;
import za.ac.cput.util.Helper;

public class AccomodationFactory {

    public static Accomodation createAccomodation(String accomodationId,
                                                  String name,
                                                  GenderType genderType,
                                                  String contactDetails,
                                                  Address address,
                                                  AccomodationStatus accomodationStatus) {

        if (Helper.isNullOrEmpty(accomodationId) || Helper.isNullOrEmpty(name)) {
            throw new IllegalArgumentException("Accommodation id or name is null or empty");
        }

        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }

        if (!Helper.isValidPostalCode(address.getPostalCode())) {
            throw new IllegalArgumentException("Invalid postal code");
        }

        return new Accomodation.Builder()
                .setAccomodationId(accomodationId)
                .setName(name)
                .setGender(genderType)
                .setContactNumber(contactDetails)
                .setAddress(address)
                .setAccomodationStatus(accomodationStatus)
                .build();
    }
}