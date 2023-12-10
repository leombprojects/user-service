package org.leombprojects.user.models;

import jakarta.persistence.*;
import lombok.Setter;

@Setter
@Entity
@Table(name="`USERS`", schema="sch-emp-calories")
public class UsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`")
    private Long id;

    @Column(name = "`NAME`")
    private String name;
    @Column(name = "`USER`")
    private String user;
    @Column(name = "`PASSWORD`")
    private String password;
}
