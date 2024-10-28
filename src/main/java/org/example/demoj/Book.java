package org.example.demoj;

import org.babyfish.jimmer.sql.*;

@Entity
public interface Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id();

    String name();

    double price();

    @Column(name = "EDITION")
    int edition();
}