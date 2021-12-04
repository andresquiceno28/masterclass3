package co.usa.ciclo3.retoCiclo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="Lib")
public class Library implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String target;
    private Integer capacity;
    private String description;

    @ManyToOne
    @JoinColumn(name="Category_id")
    @JsonIgnoreProperties("Lib")
    private Category category;

    @OneToMany (cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties({"client", "library" , "Category"})
    private List<Message> messages;

    @OneToMany (cascade = {CascadeType.PERSIST}, mappedBy = "library")
    @JsonIgnoreProperties({"library"})
    private List<Reservation> reservations;






}
