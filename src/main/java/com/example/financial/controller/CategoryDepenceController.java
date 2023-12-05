package com.example.financial.controller;

import com.example.financial.Model.CategoryDepence;
import com.example.financial.Model.Depence;
import com.example.financial.Service.CategoryDepenceService;
import com.example.financial.ServiceImp.CategoryDepenceServImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiCategoryDepence")
@CrossOrigin(origins = "*")
public class CategoryDepenceController {

    @Autowired
    private CategoryDepenceServImp serv;


    @PostMapping("/add")
    public ResponseEntity<CategoryDepence> addCategory(@RequestBody CategoryDepence CategoryDepence)
    {
        serv.addCategory(CategoryDepence);
        return new ResponseEntity<>(CategoryDepence, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<CategoryDepence>> getAllCategory(){
        List<CategoryDepence> typeCategories = serv.listAllCategory();
        return new ResponseEntity<>(typeCategories, HttpStatus.OK);
    }


}
