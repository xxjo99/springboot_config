package com.example.test.temp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempRepository extends JpaRepository<TempEntity, Long> {
    
}
