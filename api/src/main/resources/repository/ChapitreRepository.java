package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.api.model.Chapitre;

@Repository
public interface ChapitreRepository extends JpaRepository <Chapitre, Long> {}
