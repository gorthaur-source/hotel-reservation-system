package org.gorthaursource.hotel.persistence.dao;

import org.gorthaursource.hotel.persistence.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    Iterable<Reservation> findReservationByResDate(Date date);
}
