package com.backend.springjwt.IService;


import com.backend.springjwt.models.CategoryDepence;
import com.backend.springjwt.models.Depence;

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
