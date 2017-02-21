package org.rimtelecom.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 * @author Amine HANANE
 *
 */
@Entity
@Table(name = "BLOG")
public class Blog implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BLOG_ID")
	private long idBlog;

	@Column(name = "TITLE", length = 50)
	@Size(min = 5, max = 50)
	private String title;

	@Column(name = "CONTENU", length = 500)
	@Size(min = 5, max = 500)
	private String contenu;

	@Column(name = "RESUME", length = 200)
	@Size(min = 5, max = 200)
	private String resume;

	@Column(name = "IMAGE_URL", length = 200)
	private String imageUrl;

	@Temporal(TemporalType.TIMESTAMP)
	private Date publitedAt;

	@ManyToOne()
	@JoinColumn(name = "USER_ID")
	private User user;

	@OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
	private List<Comment> comments;

	public Blog() {
		// TODO Auto-generated constructor stub
	}

	public Blog(String title, String contenu, String resume, String imageUrl, Date publitedAt) {
		super();
		this.title = title;
		this.contenu = contenu;
		this.resume = resume;
		this.imageUrl = imageUrl;
		this.publitedAt = publitedAt;
	}

	public long getIdBlog() {
		return idBlog;
	}

	public void setIdBlog(long idBlog) {
		this.idBlog = idBlog;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getPublitedAt() {
		return publitedAt;
	}

	public void setPublitedAt(Date publitedAt) {
		this.publitedAt = publitedAt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
