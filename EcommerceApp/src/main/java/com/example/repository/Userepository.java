package com.example.repository;
import com.example.model.users;


import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface Userepository  extends JpaRepository<users,Long>{
	Optional<users> findByEmail(String email);

}
