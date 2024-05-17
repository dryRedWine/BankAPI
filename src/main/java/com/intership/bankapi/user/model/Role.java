package com.intership.bankapi.user.model;

import com.internship.apitaskmanagement.enums.ERole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;


@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private ERole role;


    public Role() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Role role1 = (Role) o;
        return id.equals(role1.id) && role == role1.role;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
