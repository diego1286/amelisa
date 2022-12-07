package com.example.amelisa.repository;

import com.example.amelisa.models.Terceros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITercerosRepository extends JpaRepository<Terceros, Integer > {

}
