package codsoft.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codsoft.backend.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	User findByEmailAndName(String email,String name);
    Boolean existsByEmailAndName(String email,String name);
}
