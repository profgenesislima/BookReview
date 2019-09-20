package edu.genesislima.bookreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.genesislima.bookreview.entity.User;

public interface UserDAO extends JpaRepository<User, Integer>{

}
