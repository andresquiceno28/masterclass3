package co.usa.ciclo3.retoCiclo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Message")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name="library_id")
    @JsonIgnoreProperties({"messages","reservation"})
    private Library library;

    @ManyToOne
    @JoinColumn(name="client_id")
    @JsonIgnoreProperties({"messages","reservation"})
    private Client client;
}
