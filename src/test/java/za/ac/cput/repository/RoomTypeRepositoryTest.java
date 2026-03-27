package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Room;
import za.ac.cput.domain.RoomStatus;
import za.ac.cput.domain.RoomType;
import za.ac.cput.factory.RoomTypeFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class RoomTypeRepositoryTest {
    private static IRoomTypeRepository repository = RoomTypeRepository.getInstance();
    private static RoomType roomType;

    @BeforeAll
    static void setUp() {
        RoomType roomType = new RoomTypeFactory().createRoomType(
                10.0,
                8.0,
                3.0,
                4.0,
                3500.00f
        );
    }

    @Test
    void a_create() {
        RoomType created = repository.create(roomType);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        RoomType read = repository.read(roomType.getRoomId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        RoomType updated = new RoomType.Builder()
                .copy(roomType)
                .setCapacity(3.8)
                .build();

        RoomType result = repository.update(updated);
        assertNotNull(result);
        System.out.println("Updated: " + result);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete(roomType.getRoomId());
        assertTrue(deleted);
    }

    @Test
    void e_getAllRoomTypes() {
        assertNotNull(repository.getAllRoomTypes());
        System.out.println(repository.getAllRoomTypes());
    }
}
