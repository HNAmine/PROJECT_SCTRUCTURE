package org.rimtelecom.repositories;

import org.rimtelecom.entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amine HANANE
 *
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

}
