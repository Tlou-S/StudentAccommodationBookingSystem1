package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Room;
import za.ac.cput.domain.RoomStatus;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class RoomFactoryTest {
    private static Room r1, r2;

    @BeforeEach
    void setUp() {
        r1 = RoomFactory.createRoom("123","4","A403",5400.00f, RoomStatus.AVAILABLE);
        r2 = RoomFactory.createRoom("123","4","A403",0.00f, RoomStatus.OCCUPIED);
    }
    @Test
    void a_testRoom(){
        assertNotNull(r1);
        System.out.println(r1.toString());
    }
    @Test
    void b_testRoomThatFails(){
        assertNotNull(r2);
        System.out.println(r2.toString());

    }


}