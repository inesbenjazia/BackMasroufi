package com.example.financial.Service;

import com.example.financial.Model.CategoryDepence;

import java.util.List;

public interface CategoryDepenceService {
    void addCategory(CategoryDepence CategoryDepence);
    List<CategoryDepence> listAllCategory();

}
