package za.ac.cput.repository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Accomodation;
import za.ac.cput.domain.AccomodationStatus;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.GenderType;
import za.ac.cput.factory.AccomodationFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class AccomodationRepositoryTest {

    private static IAccomodationRepository repository = AccomodationRepository.getRepository();
    private static Accomodation accomodation;

    @BeforeAll
    static void setUp() {

        Address address = new Address.Builder()
                .setStreet("Main Road")
                .setCity("Cape Town")
                .setPostalCode("7410")
                .build();

        accomodation = AccomodationFactory.createAccomodation(
                "A001",
                "CPUT Residence",
                GenderType.FEMALE,
                "0824537952",
                address,
                AccomodationStatus.AVAILABLE
        );
    }

    @Test
    void a_create() {
        Accomodation created = repository.create(accomodation);
        assertNotNull(created);
        assertEquals(accomodation.getAccomodationId(), created.getAccomodationId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Accomodation read = repository.read(accomodation.getAccomodationId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Accomodation updated = new Accomodation.Builder()
                .copy(accomodation)
                .setName("Updated Residence")
                .build();

        Accomodation result = repository.update(updated);
        assertNotNull(result);
        assertEquals("Updated Residence", result.getName());
        System.out.println("Updated: " + result);
    }

    @Test
    void d_getAll() {
        assertNotNull(repository.getAll());
        System.out.println("All: " + repository.getAll());
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(accomodation.getAccomodationId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }
}