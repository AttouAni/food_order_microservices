package com.dsi.tp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi.tp1.entities.Ordre;

public interface OrdreRepository extends JpaRepository<Ordre, Integer> {

}
