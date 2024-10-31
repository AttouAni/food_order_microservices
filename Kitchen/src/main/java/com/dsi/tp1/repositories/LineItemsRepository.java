package com.dsi.tp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi.tp1.entities.LineItems;

public interface LineItemsRepository extends JpaRepository<LineItems, Integer> {

}
