package com.backend.springjwt.IService;

import com.backend.springjwt.models.Depence;
import com.backend.springjwt.models.Revenu;

import java.util.List;

public interface RevenuService {
    void addRevenu(Revenu Revenu);
    List<Revenu> listAllRevenu();
    Revenu getRevenuById(Long id);
    void deleteRevenu(Long id);

    double calculateOverallTotalExpenses();
}
