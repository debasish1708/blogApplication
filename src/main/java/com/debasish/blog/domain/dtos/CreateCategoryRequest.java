package com.debasish.blog.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCategoryRequest {
    @NotBlank(message = "Category Name is Required")
    @Size(min = 2, max = 50, message = "Category name must be between {min} and {max} characters")
    private String name;

    @NotBlank(message = "Category slug is Required")
    private String slug;
}
