package org.gorthaursource.hotel.converters;

import org.gorthaursource.hotel.command.ReservationDto;
import org.gorthaursource.hotel.persistence.model.Reservation;
import org.springframework.stereotype.Component;

@Component
public class ReservationToReservationDto extends AbstractConverter<Reservation, ReservationDto> {

    @Override
    public ReservationDto convert(Reservation reservation) {

        ReservationDto reservationDto = new ReservationDto();
        reservationDto.setId(reservation.getId());
        reservationDto.setGuestId(reservation.getGuest().getId());
        reservationDto.setRoomNumber(reservation.getRoom().getId());
        reservationDto.setRoomName(reservation.getRoom().getRoomName());
        reservationDto.setStartDate(reservation.getResDate());
        reservationDto.setFirstName(reservation.getGuest().getFirstName());
        reservationDto.setLastName(reservation.getGuest().getLastName());
        return reservationDto;
    }
}
