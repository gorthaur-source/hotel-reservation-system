package org.gorthaursource.hotel.persistence.dao.jpa;

import org.gorthaursource.hotel.persistence.model.Room;
import org.springframework.stereotype.Repository;

@Repository
public class JpaRoomDao extends GenericJpaDao<Room>{

    public JpaRoomDao() {
        super(Room.class);
    }
}
