package codsoft.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codsoft.backend.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findFirstByEmail(String email);

}
