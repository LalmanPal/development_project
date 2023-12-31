package smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import smart.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
