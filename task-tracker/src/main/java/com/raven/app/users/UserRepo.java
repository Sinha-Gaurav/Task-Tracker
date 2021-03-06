package com.raven.app.users;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Integer>
{
	Optional<User> findByUsername(String username);
	
	Optional<User> findByEmail(String email);
	
	List<User> findByTime(String time);
}
