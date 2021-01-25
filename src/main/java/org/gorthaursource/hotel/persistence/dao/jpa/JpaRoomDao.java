package org.gorthaursource.hotel.persistence.dao.jpa;

import com.frankmoley.lil.learningspring.data.entity.Room;
import org.springframework.stereotype.Repository;

@Repository
public class JpaRoomDao extends GenericJpaDao<Room>{

    public JpaRoomDao() {
        super(Room.class);
    }
}
