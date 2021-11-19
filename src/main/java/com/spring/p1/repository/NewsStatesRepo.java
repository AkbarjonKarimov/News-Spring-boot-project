package com.spring.p1.repository;

import com.spring.p1.entity.NewsStates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsStatesRepo extends JpaRepository<NewsStates,String> {

}
