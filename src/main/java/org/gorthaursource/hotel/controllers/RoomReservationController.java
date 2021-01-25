package org.gorthaursource.hotel.controllers;

import org.gorthaursource.hotel.command.ReservationDto;
import org.gorthaursource.hotel.converters.ReservationToReservationDto;
import org.gorthaursource.hotel.persistence.model.Reservation;
import org.gorthaursource.hotel.services.ReservationService;
import org.gorthaursource.hotel.web.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationController {

    private ReservationService reservationService;
    private ReservationToReservationDto reservationToReservationDto;

    @GetMapping
    public String getReservations(@RequestParam(value = "date", required = false) String dateString, Model model) {

        Date date = DateUtils.createDateFromDateString(dateString);
        List<Reservation> reservations = this.reservationService.getRoomReservationsForDate(date);
        List<ReservationDto> roomReservations = new ArrayList<>();
        for (int i = 0; i < reservations.size(); i++) {
            roomReservations.add(reservationToReservationDto.convert(reservations.get(i)));
        }
        model.addAttribute("roomReservations", roomReservations);
        return "reservations";
    }

    @Autowired
    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    public ReservationService getReservationService() {
        return reservationService;
    }

    @Autowired
    public void setReservationToReservationDto(ReservationToReservationDto reservationToReservationDto) {
        this.reservationToReservationDto = reservationToReservationDto;
    }

    public ReservationToReservationDto getReservationToReservationDto() {
        return reservationToReservationDto;
    }
}
