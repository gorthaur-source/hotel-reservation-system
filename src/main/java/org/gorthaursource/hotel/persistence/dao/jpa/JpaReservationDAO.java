package org.gorthaursource.hotel.persistence.dao.jpa;

import com.frankmoley.lil.learningspring.data.entity.Reservation;
import org.springframework.stereotype.Repository;

@Repository
public class JpaReservationDAO extends GenericJpaDao<Reservation> {
    public JpaReservationDAO() {
        super(Reservation.class);
    }



}
