package za.ac.cput.domain;
//
// * Adress.java
// * using Builder Pattern
// * Author: Sethu Mdluli (230830811)
// * Date: 17 March 2026
// */

public class Address extends Student {
    private String city;
    private String street;
    private String postalCode;

    public Address() {
    }

    //    Builder Constractor
    public Address(Builder builder) {
        this.city = builder.city;
        this.street = builder.street;
        this.postalCode = builder.postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
    //    Builder Class
    public static class Builder {
        private String city;
        private String street;
        private String postalCode;

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }
        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }
        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(Address address){
            this.city =address.city;
            this.street =address.street;
            this.postalCode =address.postalCode;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }
}
