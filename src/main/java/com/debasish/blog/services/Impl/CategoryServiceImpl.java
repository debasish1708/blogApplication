package com.debasish.blog.services.Impl;

import com.debasish.blog.domain.entities.Category;
import com.debasish.blog.repositories.CategoryRepository;
import com.debasish.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }
}
