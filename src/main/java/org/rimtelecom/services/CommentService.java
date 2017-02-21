package org.rimtelecom.services;

import org.rimtelecom.entities.Comment;

/**
 * @author Amine HANANE
 *
 */
public interface CommentService {

	Comment commentBlog(long idUser, long idBlog, Comment comment);

	Comment updateComment(Comment comment);

	Comment deleteComment(long idComment);

}
