package com.persona.desk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "profiles" ,  uniqueConstraints = { @UniqueConstraint(name = "profile_email" , columnNames = "gmail") })
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @Column(name = "name")
    public String name;

    @Column(name = "username")
    public String username;

    @Column(name = "gmail" , unique = true)
    public String gmail;
}
