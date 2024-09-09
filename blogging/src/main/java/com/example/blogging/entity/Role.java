package com.example.blogging.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_role;

    @Column(name = "name_role")
    private String name_role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;

    public Role() {
        super();
    }

    public Role(long id_role, String name_role, User user) {
        this.id_role = id_role;
        this.name_role = name_role;
        this.user = user;
    }

    public Role(String name_role, User user) {
        this.name_role = name_role;
        this.user = user;
    }

    public long getId_role() {
        return id_role;
    }

    public void setId_role(long id_role) {
        this.id_role = id_role;
    }

    public String getName_role() {
        return name_role;
    }

    public void setName_role(String name_role) {
        this.name_role = name_role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
