package com.spring.p1.repository;

import com.spring.p1.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepo extends JpaRepository<News,Long> {

}
