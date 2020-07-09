package repositories;

import model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}