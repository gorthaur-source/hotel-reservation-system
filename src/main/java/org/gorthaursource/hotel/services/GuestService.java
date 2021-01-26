package org.gorthaursource.hotel.services;

import org.gorthaursource.hotel.persistence.dao.GuestDao;
import org.gorthaursource.hotel.persistence.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    private GuestDao guestDao;


    public GuestDao getGuestDao() {
        return guestDao;
    }

    @Autowired
    public void setGuestDao(GuestDao guestDao) {
        this.guestDao = guestDao;
    }


    public List<Guest> guestList() {
        return guestDao.findAll();
    }
}
