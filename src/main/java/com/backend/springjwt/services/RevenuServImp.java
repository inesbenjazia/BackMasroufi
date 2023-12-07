package com.backend.springjwt.services;
import com.backend.springjwt.models.Depence;
import com.backend.springjwt.models.Revenu;
import com.backend.springjwt.repository.RevenuRepository;
import com.backend.springjwt.IService.RevenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class RevenuServImp implements RevenuService {
    @Autowired
    public RevenuRepository repo;

    @Override
    public void addRevenu(Revenu Revenu) {
        repo.save(Revenu);

    }

    @Override
    public List<Revenu> listAllRevenu() {
        return repo.findAll();
    }


    @Override
    public Revenu getRevenuById(Long id){
        return repo.findById(id).get();}

    @Override
    public void deleteRevenu(Long id) {
        repo.deleteById(id);
    }


    @Override
    public double calculateOverallTotalExpenses() {
        // Fetch all expenses
        List<Revenu> expenses = repo.findAll();
        // Calculate the overall total expenses
        double overallTotalExpenses = expenses.stream()
                .mapToDouble(Revenu::getMontant)
                .sum();

        return overallTotalExpenses;
    }

}
