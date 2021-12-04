package co.usa.ciclo3.retoCiclo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date starDate;
    private Date devolutionDate;
    private String status = "created";


    @ManyToOne
    @JoinColumn(name = "library_id")
    @JsonIgnoreProperties({"reservation"})
    private Library library;

    @ManyToOne
    @JoinColumn(name="client_id")
    @JsonIgnoreProperties({"messages","reservation"})
    private Client client;

}
