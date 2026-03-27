package za.ac.cput.repository;

import za.ac.cput.domain.RoomType;

import java.util.ArrayList;
import java.util.List;

public class RoomTypeRepository implements IRoomTypeRepository {
    private static IRoomTypeRepository repository = null;
    private List<RoomType> roomTypeList;

    private RoomTypeRepository() {
        roomTypeList = new ArrayList<>();
    }

    public static IRoomTypeRepository getInstance() {
        if (repository == null) {
            repository = new RoomTypeRepository();
        }
        return repository;

    }

    @Override
    public RoomType create(RoomType roomType) {
        boolean success = roomTypeList.add(roomType);
        if (success) {
            return roomType;
        }
        return null;
    }

    @Override
    public RoomType read(String roomId) {
        for (RoomType roomType : roomTypeList) {
            if (roomType.getRoomId().equals(roomId)) {
                return roomType;
            }
        }
        return null;
    }

    @Override
    public RoomType update(RoomType roomType) {
        String id = roomType.getRoomId();
        RoomType oldRoomType = read(id);
        if (oldRoomType == null) {
            return null;
        }
        boolean success = roomTypeList.remove(oldRoomType);
        if (!success) {
            return roomType;
        }
        if (roomTypeList.add(roomType)) {
            return roomType;
        }
        return null;
    }

    @Override
    public boolean delete(String roomId) {
        RoomType roomTypeToDelete = read(roomId);
        if (roomTypeToDelete == null) {
            return false;
        }
        return (roomTypeList.remove(roomTypeToDelete));
    }

    @Override
    public List<RoomType> getAll() {
        return List.of();
    }

    @Override
    public List<RoomType> getAllRoomTypes() {
        return List.of();
    }
}
