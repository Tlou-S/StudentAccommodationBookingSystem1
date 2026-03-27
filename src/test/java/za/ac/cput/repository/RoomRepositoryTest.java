package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Room;
import za.ac.cput.domain.RoomStatus;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.RoomFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class RoomRepositoryTest {
    private static IRoomRepository repository = RoomRepository.getInstance();
    private static Room room;

    @BeforeAll
    static void setup() {

        Room room = new RoomFactory().createRoom(
                "101",
                "4",
                "A122",
                5400.00f,
                RoomStatus.AVAILABLE

        );
    }
    @Test
    void a_create() {
        Room created = repository.create(room);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Room read = repository.read(room.getRoomId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Room updated = new Room.Builder()
                .copy(room)
                .setRoomStatus(RoomStatus.AVAILABLE)
                .build();

        Room result = repository.update(updated);
        assertNotNull(result);
        System.out.println("Updated: " + result);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete(room.getRoomId());
        assertTrue(deleted);
    }

    @Test
    void e_getAllRooms() {
        assertNotNull(repository.getAllRooms());
        System.out.println(repository.getAllRooms());
    }
}
