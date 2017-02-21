package org.rimtelecom.repositories;

import org.rimtelecom.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amine HANANE
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
