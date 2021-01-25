package org.gorthaursource.hotel.persistence.model;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractModel implements Model {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
/*
    @Version
    @Column(name = "VERSION")
    private Integer version;

    @CreationTimestamp
    @Column(name = "CREATION_TIME")
    private Date creationTime;
    @UpdateTimestamp
    @Column(name = "UPDATE_TIME")
    private Date updateTime;
*/

    @Override
    public Integer getId() {
        return id;

    }

    @Override
    public void setId(int id) {
        this.id = id;
    }



}
