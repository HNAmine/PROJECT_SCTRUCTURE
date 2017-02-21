package org.rimtelecom.dtos;

import java.util.Date;

/**
 * @author Amine HANANE
 *
 */
public class BlogAddDTO {

	private String title;
	private String contenu;
	private String resume;
	private String imageUrl;
	private Date publitedAt;

	private UserAssociatedDTO user;

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

	public UserAssociatedDTO getUser() {
		return user;
	}

	public void setUser(UserAssociatedDTO user) {
		this.user = user;
	}

}
