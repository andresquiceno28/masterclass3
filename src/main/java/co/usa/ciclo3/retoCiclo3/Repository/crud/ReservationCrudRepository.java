package co.usa.ciclo3.retoCiclo3.Repository.crud;

import co.usa.ciclo3.retoCiclo3.model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {

    public List<Reservation> findAllByIdReservation(Integer idReservation);
}
