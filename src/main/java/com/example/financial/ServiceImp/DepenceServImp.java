
package com.example.financial.ServiceImp;


import com.example.financial.Model.Depence;
import com.example.financial.Repository.DepenceRepository;
import com.example.financial.Service.DepenceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class DepenceServImp implements DepenceService {
    @Autowired
    public DepenceRepository repo;



    @Override
    public void addDepence(Depence Depence) {
        repo.save(Depence);

    }

    @Override
    public List<Depence> listAllDepence() {
        return repo.findAll();
    }

    @Override
    public Depence getDepenceById(Long id){
        return repo.findById(id).get();}

    @Override
    public void deleteDepence(Long id) {
        repo.deleteById(id);
    }


    @Override
    public double calculateTotalExpensesByCategoryId(Long categoryId) {
        // Fetch all expenses
        List<Depence> expenses = repo.findAll();

        // Filter expenses for the given category ID
        double totalExpenses = expenses.stream()
                .filter(depence -> depence.getCategoryDepence().getId().equals(categoryId))
                .mapToDouble(Depence::getMontant)
                .sum();

        return totalExpenses;
    }

    @Override
    public double calculateOverallTotalExpenses() {
        // Fetch all expenses
        List<Depence> expenses = repo.findAll();
        // Calculate the overall total expenses
        double overallTotalExpenses = expenses.stream()
                .mapToDouble(Depence::getMontant)
                .sum();

        return overallTotalExpenses;
    }

    @Override
    public double calculatePercentageOfTotalExpensesByCategory(Long categoryId) {
        // Fetch all expenses
        List<Depence> expenses = repo.findAll();

        // Calculate the total expenses for the specified category
        double totalExpensesForCategory = expenses.stream()
                .filter(depence -> depence.getCategoryDepence().getId().equals(categoryId))
                .mapToDouble(Depence::getMontant)
                .sum();

        // Calculate the overall total expenses
        double overallTotalExpenses = expenses.stream()
                .mapToDouble(Depence::getMontant)
                .sum();

        // Calculate the percentage
        double percentage = (totalExpensesForCategory / overallTotalExpenses) * 100.0;

        return percentage;
    }


}
