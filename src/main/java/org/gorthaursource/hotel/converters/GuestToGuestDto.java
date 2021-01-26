package org.gorthaursource.hotel.converters;

import org.gorthaursource.hotel.command.GuestDto;
import org.gorthaursource.hotel.persistence.model.Guest;

public class GuestToGuestDto extends AbstractConverter<Guest, GuestDto> {


    @Override
    public GuestDto convert(Guest guest) {

        GuestDto guestDto = new GuestDto();
        guestDto.setAddress(guest.getAddress());
        guestDto.setCountry(guest.getCountry());
        guestDto.setLastName(guest.getLastName());
        guestDto.setFirstName(guest.getFirstName());
        guestDto.setId(guest.getId());
        guestDto.setEmailAddress(guest.getEmailAddress());
        guestDto.setState(guest.getState());
        guestDto.setPhoneNumber(guest.getPhoneNumber());

        return guestDto;
    }
}
