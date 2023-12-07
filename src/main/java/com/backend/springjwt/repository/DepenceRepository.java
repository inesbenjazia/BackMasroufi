package com.backend.springjwt.repository;

import com.backend.springjwt.models.CategoryDepence;
import com.backend.springjwt.models.Depence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  DepenceRepository extends JpaRepository<Depence,Long> {
}
