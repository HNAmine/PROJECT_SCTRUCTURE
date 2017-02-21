package org.rimtelecom.entities;

import java.io.Serializable;

/**
 * @author Amine HANANE
 *
 */
public class CommentId implements Serializable {

	private static final long serialVersionUID = 1L;

	private long blog;
	private long user;

	public long getBlog() {
		return blog;
	}

	public void setBlog(long blog) {
		this.blog = blog;
	}

	public long getUser() {
		return user;
	}

	public void setUser(long user) {
		this.user = user;
	}

}
