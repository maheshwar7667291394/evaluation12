package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Email;

@Repository
public interface CurrentuserDao extends JpaRepository<Email, Integer>{

}
