package com.vitasoft.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitasoft.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {

}
