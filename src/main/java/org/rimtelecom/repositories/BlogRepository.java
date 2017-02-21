package org.rimtelecom.repositories;

import org.rimtelecom.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amine HANANE
 *
 */
@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

}
