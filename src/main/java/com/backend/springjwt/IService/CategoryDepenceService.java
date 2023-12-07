package com.backend.springjwt.IService;

import com.backend.springjwt.models.CategoryDepence;

import java.util.List;

public interface CategoryDepenceService {
    void addCategory(CategoryDepence CategoryDepence);
    List<CategoryDepence> listAllCategory();

}
