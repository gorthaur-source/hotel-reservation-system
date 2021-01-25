package org.gorthaursource.hotel.persistence.dao.jpa;

import org.gorthaursource.hotel.persistence.model.Guest;
import org.springframework.stereotype.Repository;

@Repository
public class JpaGuestDAO extends GenericJpaDao<Guest> {
    public JpaGuestDAO() {
        super(Guest.class);
    }
}
