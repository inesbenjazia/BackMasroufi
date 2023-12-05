package com.example.financial.Repository;

import com.example.financial.Model.CategoryDepence;
import com.example.financial.Model.Depence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  DepenceRepository extends JpaRepository<Depence,Long> {
}
