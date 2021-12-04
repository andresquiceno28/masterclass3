package co.usa.ciclo3.retoCiclo3.service;

import co.usa.ciclo3.retoCiclo3.Repository.crud.ReservationCrudRepository;
import co.usa.ciclo3.retoCiclo3.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationCrudRepository reservationCrudRepository;

    public void save(Reservation reservation){
        reservationCrudRepository.save(reservation);
    }

    public List<Reservation> getAll(){
        return (List<Reservation>)reservationCrudRepository.findAll();
    }

    public Reservation getReservation(Integer idReservation){
        return reservationCrudRepository.findById(idReservation).orElse(null);
    }

}
