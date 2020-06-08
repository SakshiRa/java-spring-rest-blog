package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pluralsight.blog.model.Author;

import javax.persistence.ManyToOne;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}