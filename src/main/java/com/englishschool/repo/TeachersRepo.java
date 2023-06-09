package com.englishschool.repo;

import com.englishschool.model.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepo extends JpaRepository<Teachers, Long> {

}
