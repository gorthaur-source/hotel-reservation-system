package org.gorthaursource.hotel.persistence.dao.jpa;

import org.gorthaursource.hotel.persistence.dao.ReservationDao;
import org.gorthaursource.hotel.persistence.model.Reservation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import java.util.Date;

@Repository
public class JpaReservationDao extends GenericJpaDao<Reservation> implements ReservationDao {

    @PersistenceContext
    protected EntityManager em;

    public JpaReservationDao() {
        super(Reservation.class);
    }

    @Override
    public Iterable<Reservation> findReservationByResDate(Date date) {
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Reservation> q = cb.createQuery(Reservation.class);
        Root<Reservation> c = q.from(Reservation.class);
        ParameterExpression<Date> p = cb.parameter(Date.class);
        q.select(c).where(cb.equal(c.get("resDate"), p));

        TypedQuery<Reservation> query = em.createQuery(q);
        query.setParameter(p, date);

        return query.getResultList();
    }


}
