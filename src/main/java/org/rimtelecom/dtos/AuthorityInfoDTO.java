package org.rimtelecom.dtos;

import org.rimtelecom.entities.types.AuthorityName;

/**
 * @author Amine HANANE
 *
 */
public class AuthorityInfoDTO {

	private long idAuthoriy;

	private AuthorityName authorityName;

	public long getIdAuthoriy() {
		return idAuthoriy;
	}

	public void setIdAuthoriy(long idAuthoriy) {
		this.idAuthoriy = idAuthoriy;
	}

	public AuthorityName getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(AuthorityName authorityName) {
		this.authorityName = authorityName;
	}

}
