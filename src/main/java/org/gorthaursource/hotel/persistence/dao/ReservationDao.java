package org.gorthaursource.hotel.persistence.dao;

import org.gorthaursource.hotel.persistence.model.Reservation;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationDao extends Dao<Reservation> {

    List<Reservation> findByDate(Date date);
}
