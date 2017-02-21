package org.rimtelecom.dtos;

import java.util.Date;

/**
 * @author Amine HANANE
 *
 */
public class CommentInfoDTO {

	private String contenu;
	private Date commentedAt;

	private UserAssociatedDTO user;
	private BlogAssociatedDTO blog;

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getCommentedAt() {
		return commentedAt;
	}

	public void setCommentedAt(Date commentedAt) {
		this.commentedAt = commentedAt;
	}

	public UserAssociatedDTO getUser() {
		return user;
	}

	public void setUser(UserAssociatedDTO user) {
		this.user = user;
	}

	public BlogAssociatedDTO getBlog() {
		return blog;
	}

	public void setBlog(BlogAssociatedDTO blog) {
		this.blog = blog;
	}

}
