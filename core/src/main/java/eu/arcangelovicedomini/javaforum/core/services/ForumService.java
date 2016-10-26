package eu.arcangelovicedomini.javaforum.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.arcangelovicedomini.javaforum.core.domain.Forum;
import eu.arcangelovicedomini.javaforum.core.domain.ForumDao;
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
}
