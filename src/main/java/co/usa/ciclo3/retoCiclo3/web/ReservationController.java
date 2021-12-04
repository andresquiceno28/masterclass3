package co.usa.ciclo3.retoCiclo3.web;

import co.usa.ciclo3.retoCiclo3.model.Reservation;
import co.usa.ciclo3.retoCiclo3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/Reservation/all")
    public List<Reservation> save() {
        return reservationService.getAll();
    }

    @GetMapping("/Reservation/{id}")
    public Reservation get(@PathVariable("id") Integer idReservation) {
        return reservationService.getReservation(idReservation);
    }

    @PutMapping("/Reservation/{id}")
    public ResponseEntity<?> put(@RequestBody Reservation reservation) {
        reservationService.save(reservation);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/Reservation/save")
    public ResponseEntity<?> post(@RequestBody Reservation reservation) {
        reservationService.save(reservation);
        return ResponseEntity.status(201).build();
    }

}
