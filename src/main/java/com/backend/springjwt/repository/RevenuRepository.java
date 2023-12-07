package com.backend.springjwt.repository;

import com.backend.springjwt.models.Revenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  RevenuRepository extends JpaRepository<Revenu,Long> {
}
