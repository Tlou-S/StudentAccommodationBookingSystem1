package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Room;
import za.ac.cput.domain.RoomStatus;
import za.ac.cput.domain.RoomType;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class RoomTypeFactoryTest {
    private static RoomType rt1, rt2;

    @BeforeEach
    void setUp() {
        rt1 = RoomTypeFactory.createRoomType(10.0, 8.0, 3.0, 4.0, 3500.00f);
        rt2 = RoomTypeFactory.createRoomType(8.0, 6.0, 0, 2.0, 4800.00f);
    }

    @Test
    void a_testRoom() {
        assertNotNull(rt1);
        System.out.println(rt1.toString());
    }

    @Test
    void b_testRoomThatFails() {
        assertNotNull(rt2);
        System.out.println(rt2.toString());

    }

}