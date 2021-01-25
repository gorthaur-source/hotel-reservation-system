package org.gorthaursource.hotel.persistence.model;

import jdk.jfr.Timestamp;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation extends AbstractModel {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ROOM_ID")
    private Room room;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "GUEST_ID")
    private Guest guest;

    @Temporal(TemporalType.DATE)
    @Column(name = "RES_DATE")
    private Date resDate;


    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    public Date getResDate() {
        return resDate;
    }

    public void setResDate(Date resDate) {
        this.resDate = resDate;
    }
}
