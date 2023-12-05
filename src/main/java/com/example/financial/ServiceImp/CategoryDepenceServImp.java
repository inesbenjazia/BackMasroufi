package com.example.financial.ServiceImp;

import com.example.financial.Model.CategoryDepence;
import com.example.financial.Repository.CategoryDepenceRepository;
import com.example.financial.Service.CategoryDepenceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class CategoryDepenceServImp implements CategoryDepenceService {
    @Autowired
    public CategoryDepenceRepository repo;



    @Override
    public void addCategory(CategoryDepence CategoryDepence) {
        repo.save(CategoryDepence);

    }

    @Override
    public List<CategoryDepence> listAllCategory(){ return repo.findAll();}



}
