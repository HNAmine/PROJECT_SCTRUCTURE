package org.rimtelecom.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 * @author Amine HANANE
 *
 */
@Entity
@Table(name = "COMMENT")
@IdClass(CommentId.class)
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
	private User user;

	@Id
	@ManyToOne
	@JoinColumn(name = "BLOG_ID", referencedColumnName = "BLOG_ID")
	private Blog blog;

	@Column(name = "CONTENU", length = 50)
	@Size(min = 5, max = 50)
	private String contenu;

	@Temporal(TemporalType.TIMESTAMP)
	private Date commentedAt;

	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(String contenu, Date commentedAt) {
		super();
		this.contenu = contenu;
		this.commentedAt = commentedAt;
	}

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	@Override
	public String toString() {
		return "Comment [user=" + user.getFirstName() + ", blog=" + blog.getTitle() + ", contenu=" + contenu
				+ ", commentedAt=" + commentedAt + "]";
	}

}
