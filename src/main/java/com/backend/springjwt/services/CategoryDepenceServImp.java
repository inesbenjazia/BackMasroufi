package com.backend.springjwt.services;

import com.backend.springjwt.models.CategoryDepence;
import com.backend.springjwt.repository.CategoryDepenceRepository;
import com.backend.springjwt.IService.CategoryDepenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
