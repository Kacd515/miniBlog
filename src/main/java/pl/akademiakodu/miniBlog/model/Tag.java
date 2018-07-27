package pl.akademiakodu.miniBlog.model;

import javax.persistence.*;

@Entity
public class Tag {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int a =0;

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
