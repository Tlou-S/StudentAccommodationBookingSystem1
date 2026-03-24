package za.ac.cput.domain;

public class Room {
    private String roomId;
    private String floor;
    private String roomNumber;
    private double pricePerMonth;
    private RoomStatus roomStatus;

    public Room() {

    }

    public Room(Room.Builder builder) {
        this.roomId = builder.roomId;
        this.floor = builder.floor;
        this.roomNumber = builder.roomNumber;
        this.pricePerMonth = builder.pricePerMonth;
        this.roomStatus = builder.roomStatus;
    }


    public String getRoomId() {
        return roomId;
    }

    public String getFloor() {
        return floor;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerMonth() {
        return pricePerMonth;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", floor='" + floor + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", pricePerMonth=" + pricePerMonth +
                ", roomStatus=" + roomStatus +
                '}';
    }

    public static class Builder {
        private String roomId;
        private String floor;
        private String roomNumber;
        private double pricePerMonth;
        private RoomStatus roomStatus;

        public Room.Builder setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }

        public Room.Builder setFloor(String floor) {
            this.floor = floor;
            return this;
        }

        public Room.Builder setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        public Room.Builder setPricePerMonth(double pricePerMonth) {
            this.pricePerMonth = pricePerMonth;
            return this;
        }

        public Room.Builder setRoomStatus(RoomStatus roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }

        public Builder copy(Room room) {
            this.roomId = room.roomId;
            this.floor = room.floor;
            this.roomNumber = room.roomNumber;
            this.pricePerMonth = room.pricePerMonth;
            this.roomStatus = room.roomStatus;
        }

        public Room build() {
            return new Address(this);
        }
    }
}
}
