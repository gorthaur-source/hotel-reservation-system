package org.gorthaursource.hotel.persistence.model;


import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractModel implements Model {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Override
    public Integer getId() {
        return id;

    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

}
