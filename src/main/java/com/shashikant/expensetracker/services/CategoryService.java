package com.shashikant.expensetracker.services;

import com.shashikant.expensetracker.model.Category;
import com.shashikant.expensetracker.entityexceptions.EtBadRequestException;
import com.shashikant.expensetracker.entityexceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

}
