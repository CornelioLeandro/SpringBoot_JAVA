package com.cornelioleandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cornelioleandro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
