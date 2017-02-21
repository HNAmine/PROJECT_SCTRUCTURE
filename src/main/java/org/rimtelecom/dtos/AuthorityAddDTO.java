package org.rimtelecom.dtos;

import org.rimtelecom.entities.types.AuthorityName;

/**
 * @author Amine HANANE
 *
 */
public class AuthorityAddDTO {

	private AuthorityName authorityName;

	/**
	 * @return
	 */
	public AuthorityName getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(AuthorityName authorityName) {
		this.authorityName = authorityName;
	}

	@Override
	public String toString() {
		return "AuthorityAddDTO [authorityName=" + authorityName + "]";
	}

}
