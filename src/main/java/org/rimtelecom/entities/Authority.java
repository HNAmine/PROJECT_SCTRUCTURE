package org.rimtelecom.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.rimtelecom.entities.types.AuthorityName;

/**
 * @author Amine HANANE
 *
 */
@Entity
@Table(name = "AUTHORITY")
public class Authority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUTHORITY_ID", length = 50)
	private long idAuthoriy;

	@Enumerated(EnumType.STRING)
	private AuthorityName authorityName;

	@ManyToMany(mappedBy = "authorities")
	private Set<User> users;

	public Authority() {
		// TODO Auto-generated constructor stub
	}

	public Authority(AuthorityName authorityName) {
		super();
		this.authorityName = authorityName;
	}

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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Authority [authorityName=" + authorityName + "]";
	}

}
