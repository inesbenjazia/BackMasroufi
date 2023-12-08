package com.backend.springjwt.controllers;

import com.backend.springjwt.IService.CategoryDepenceService;
import com.backend.springjwt.models.CategoryDepence;
import com.backend.springjwt.models.Revenu;
import com.backend.springjwt.services.DepenceServImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryDepenceService serv ;
    @GetMapping("")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<List<CategoryDepence>> listAllCategory(){
        List<CategoryDepence> Revenues = serv.listAllCategory();
        return new ResponseEntity<>(Revenues, HttpStatus.OK);
    }
}
