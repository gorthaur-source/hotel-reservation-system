package org.gorthaursource.hotel.persistence.dao.jpa;

import org.gorthaursource.hotel.persistence.dao.RoomDao;
import org.gorthaursource.hotel.persistence.model.Room;

public class JpaRoomDao extends GenericJpaDao<Room> implements RoomDao {


    public JpaRoomDao() {
        super(Room.class);
    }
}
