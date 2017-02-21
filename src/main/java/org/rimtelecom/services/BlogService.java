package org.rimtelecom.services;

import org.rimtelecom.entities.Blog;

/**
 * @author Amine HANANE
 *
 */
public interface BlogService {

	Blog publishBlog(long idUser, Blog blog);

	Blog updateBlog(long idBlog);

	Blog deleteBlog(long idBlog);
}
