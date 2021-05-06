package model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "MUSICIAN")
@Data
public class Musician {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "musician")
    private Set<Performance> performances;
}
