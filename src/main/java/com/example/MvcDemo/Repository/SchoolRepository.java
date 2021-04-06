package com.example.MvcDemo.Repository;

import com.example.MvcDemo.Model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {
}
