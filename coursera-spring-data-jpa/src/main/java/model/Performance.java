package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Performance {
    @Id
    private long id;

    private String title;

    @ManyToOne
    @JoinColumn(nullable = false,name = "musician_id")
    private Musician musician;

}
