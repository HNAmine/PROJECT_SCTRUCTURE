package org.rimtelecom.services;

import java.util.List;

import org.rimtelecom.entities.Authority;

/**
 * @author Amine HANANE
 *
 */
public interface AuthorityService {

	Authority addAuthority(Authority authority);

	Authority getAuthority(long idAuthority);

	Authority deleteAuthority(long idAuthority);

	Authority updateAuthority(Authority authority);

	List<Authority> getAllAuthorities();

	Authority addAuthorityToUser(long idAuthority, long idUser);

	Authority removeAuthorityToUser(long idAuthority, long idUser);

}
