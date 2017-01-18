package eu.arcangelovicedomini.javaforum.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.arcangelovicedomini.javaforum.core.domain.Forum;
import eu.arcangelovicedomini.javaforum.core.domain.ForumDao;
import eu.arcangelovicedomini.javaforum.core.exception.JFException;
import eu.arcangelovicedomini.javaforum.core.exception.JFException.ExceptionType;
import eu.arcangelovicedomini.javaforum.core.vo.ForumVO;

@Service("forumService")
public class ForumService {
	
	@Autowired
	private ForumDao forumDao;
	
	public void setForumDao(ForumDao forumDao) {
		this.forumDao = forumDao;
	}
	
	public ForumVO getDetailForum(Long idForum) throws Exception {
		try {
			Forum forum = forumDao.get(idForum);
			return forumDao.toVo(forum);
		} catch (Throwable ex) {
			// FIXME log and handle this
			throw ex;
		}
	}
	
	public ForumVO createForum(String title, String description, String url) throws JFException {
		try {
			Forum forum = new Forum();
			forum.setTitle(title);
			forum.setDescription(description);
			forum.setUrl(url);
			forum = forumDao.create(forum);
			return forumDao.toVo(forum);
		} catch (Throwable ex) {
			// FIXME log and handle this
			throw new JFException(ex, ExceptionType.TECHNICAL, "ERROR IN SERVICE LAYER: " + ex.getMessage(), "error.Application.serviceLayerTechnicalError", ex.getMessage());
		}
	}
}
