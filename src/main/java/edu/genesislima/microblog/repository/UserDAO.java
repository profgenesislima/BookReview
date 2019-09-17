package edu.genesislima.microblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.genesislima.microblog.entity.User;

public interface UserDAO extends JpaRepository<User, Integer>{

}
