package org.gorthaursource.hotel.persistence.dao.jpa;

import org.gorthaursource.hotel.persistence.dao.ReservationDao;
import org.gorthaursource.hotel.persistence.model.Reservation;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class JpaReservationDAO extends GenericJpaDao<Reservation> {
    public JpaReservationDAO() {
        super(Reservation.class);
    }

}
