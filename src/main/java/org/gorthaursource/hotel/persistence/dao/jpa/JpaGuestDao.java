package org.gorthaursource.hotel.persistence.dao.jpa;

import org.gorthaursource.hotel.persistence.dao.GuestDao;
import org.gorthaursource.hotel.persistence.model.Guest;
import org.springframework.stereotype.Repository;

@Repository
public class JpaGuestDao extends GenericJpaDao<Guest> implements GuestDao {

    public JpaGuestDao() {
        super(Guest.class);
    }
}
