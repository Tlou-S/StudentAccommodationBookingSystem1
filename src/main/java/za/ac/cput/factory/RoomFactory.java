package za.ac.cput.factory;

import za.ac.cput.domain.Room;
import za.ac.cput.domain.RoomStatus;
import za.ac.cput.domain.Student;
import za.ac.cput.util.Helper;

public class RoomFactory {

    public static Room create(String roomId, String floor, String roomNumber, double pricePerMonth, RoomStatus roomStatus) {
        if ((Helper.isNullOrEmpty(roomId)) || (Helper.isNullOrEmpty(floor) || (Helper.isNullOrEmpty(roomNumber)))){
            return null;
        }

        if (pricePerMonth <= 0) {
            System.out.println("Price per month must be greater than zero");
        }

        if (roomStatus == null) {
            System.out.println("Room status cannot be null");
        }

        return new Room.Builder()
                .setRoomId(roomId)
                .setFloor(floor)
                .setRoomNumber(roomNumber)
                .setPricePerMonth(pricePerMonth)
                .setRoomStatus(roomStatus)
                .build();
    }
}
