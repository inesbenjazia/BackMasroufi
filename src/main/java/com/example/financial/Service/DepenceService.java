package com.example.financial.Service;


import com.example.financial.Model.CategoryDepence;
import com.example.financial.Model.Depence;

import java.util.List;

public interface DepenceService {
    void addDepence(Depence Depence);
    List<Depence> listAllDepence();
    Depence getDepenceById(Long id);
    void deleteDepence(Long id);

    double calculateTotalExpensesByCategoryId(Long categoryId);

    double calculateOverallTotalExpenses();

    double calculatePercentageOfTotalExpensesByCategory(Long categoryId);
}
