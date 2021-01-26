package org.gorthaursource.hotel.controllers;

import org.gorthaursource.hotel.command.GuestDto;
import org.gorthaursource.hotel.command.ReservationDto;
import org.gorthaursource.hotel.converters.GuestToGuestDto;
import org.gorthaursource.hotel.converters.ReservationToReservationDto;
import org.gorthaursource.hotel.persistence.dao.GuestDao;
import org.gorthaursource.hotel.persistence.model.Guest;
import org.gorthaursource.hotel.persistence.model.Reservation;
import org.gorthaursource.hotel.services.GuestService;
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
@RequestMapping("/guests")
public class GuestController {

    private GuestService guestService;
    private GuestToGuestDto guestToGuestDto;

    public GuestService getGuestService() {
        return guestService;
    }

    @Autowired
    public void setGuestService(GuestService guestService) {
        this.guestService = guestService;
    }


    @GetMapping("/list")
    public String getGuests(Model model) {

        List<Guest> guests = this.guestService.getGuestList();
        List<GuestDto> guestList = new ArrayList<>();
        for (Guest guest : guests) {
            guestList.add(guestToGuestDto.convert(guest));
        }
        model.addAttribute("guestList", guestList);
        return "guestList";
    }

    @Autowired
    public void setGuestToGuestDto(GuestToGuestDto guestToGuestDto) {
        this.guestToGuestDto = guestToGuestDto;
    }
}
