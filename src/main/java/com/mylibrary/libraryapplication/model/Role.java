package com.mylibrary.libraryapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles" ,uniqueConstraints = @UniqueConstraint(columnNames = {"username", "role"}))
public class Role {

    @ManyToOne
    @JoinColumn(name = "username")
    @JsonIgnore
    private User user;

    @Column(name = "role")
    private String name;
}
