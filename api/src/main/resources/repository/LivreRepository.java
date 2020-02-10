package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.api.model.Livre;

@Repository
public interface LivreRepository extends JpaRepository <Livre, Long> {}
