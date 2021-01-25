package org.gorthaursource.hotel.services;

import java.util.Date;
import java.util.List;

import org.gorthaursource.hotel.persistence.dao.ReservationRepository;

import org.gorthaursource.hotel.persistence.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {

        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getRoomReservationsForDate(Date date) {

        List<Reservation> reservations = (List<Reservation>) this.reservationRepository.findReservationByResDate(new java.sql.Date(date.getTime()));

        reservations.sort((o1, o2) -> {
            if (o1.getRoom().getRoomName() == o2.getRoom().getRoomName()) {
                return o1.getRoom().getRoomNumber().compareTo(o2.getRoom().getRoomNumber());
            }
            return o1.getRoom().getRoomName().compareTo(o2.getRoom().getRoomName());
        });
        return reservations;
    }
}
