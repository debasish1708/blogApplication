package com.debasish.blog.services;

import com.debasish.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
}
