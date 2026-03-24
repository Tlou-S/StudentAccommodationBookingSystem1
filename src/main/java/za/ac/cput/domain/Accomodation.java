package za.ac.cput.domain;

public class Accomodation {
    private String accomodationId;
    private String name;
    private String gender;
    private String contactNumber;
    private String location;
    private AccomodationStatus accomodationStatus;

    private Accomodation(Builder builder) {
        this.accomodationId = builder.accomodationId;
        this.name = builder.name;
        this.gender = builder.gender;
        this.contactNumber = builder.contactNumber;
        this.location = builder.location;
        this.accomodationStatus = builder.accomodationStatus;
    }

    // Getters
    public String getaccomodationId() {
        return accomodationId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {

        return gender;
    }

    public String getContactNumber() {

        return contactNumber;
    }

    public String getLocation() {

        return location;
    }

    public AccomodationStatus getAccomodationStatus() {
        return accomodationStatus;
    }

    @Override
    public String toString() {
        return "Accomodation{" +
                "accomodationId='" + accomodationId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", location='" + location + '\'' +
                ", accomodationStatus=" + accomodationStatus +
                '}';
    }

    // Builder class
    public static class Builder {

        private String accomodationId;
        private String name;
        private String gender;
        private String contactNumber;
        private String location;
        private AccomodationStatus accomodationStatus;

        public Builder setAccomodationId(String accomodationId) {
            this.accomodationId = accomodationId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setAccomodationStatus(AccomodationStatus accomodationStatus) {
            this.accomodationStatus = accomodationStatus;
            return this;
        }

        public Builder copy(Accomodation accomodation) {
            this.accomodationId = accomodation.accomodationId;
            this.name = accomodation.name;
            this.gender = accomodation.gender;
            this.contactNumber = accomodation.contactNumber;
            this.location = accomodation.location;
            this.accomodationStatus = accomodation.accomodationStatus;
            return this;
        }

        public Accomodation build() {
            return new Accomodation(this);
        }
    }
}


