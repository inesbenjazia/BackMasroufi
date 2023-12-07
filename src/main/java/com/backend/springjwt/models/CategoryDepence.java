package com.backend.springjwt.models;

import java.util.List;
import javax.persistence.*;
@Entity
public class CategoryDepence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String logo;
    @OneToMany(mappedBy = "CategoryDepence",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   private List<Depence> depences ;

    public CategoryDepence(Long id, String name, List<Depence> depences,String logo ) {
        this.id = id;
        this.name = name;
        this.depences = depences;
        this.logo =logo;
    }




    //constructor vide
    public CategoryDepence() {

    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<Depence> getDepences() {
        return depences;
    }

    public void setDepences(List<Depence> depences) {
        this.depences = depences;
    }

    //getter and setter id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    //getter and setter name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
