package org.gorthaursource.hotel.persistence.dao.jpa;

import com.frankmoley.lil.learningspring.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public class JpaGuestDAO extends GenericJpaDao<Guest> {
    public JpaGuestDAO() {
        super(Guest.class);
    }
}
