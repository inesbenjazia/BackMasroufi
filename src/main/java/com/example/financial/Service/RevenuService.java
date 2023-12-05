package com.example.financial.Service;

import com.example.financial.Model.Depence;
import com.example.financial.Model.Revenu;

import java.util.List;

public interface RevenuService {
    void addRevenu(Revenu Revenu);
    List<Revenu> listAllRevenu();
    Revenu getRevenuById(Long id);
    void deleteRevenu(Long id);

    double calculateOverallTotalExpenses();
}
