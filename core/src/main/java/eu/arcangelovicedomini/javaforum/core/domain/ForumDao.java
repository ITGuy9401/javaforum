package eu.arcangelovicedomini.javaforum.core.domain;

import org.springframework.stereotype.Repository;

import eu.arcangelovicedomini.javaforum.core.vo.ForumVO;

@Repository("forumDao")
public class ForumDao extends DaoBase<Forum, ForumVO, Long> {

	@Override
	protected void toVo(Forum entity, ForumVO vo) throws Exception {
		vo.setForumId(entity.getForumId());
		vo.setDescription(entity.getDescription());
		vo.setTitle(entity.getTitle());
		vo.setUrl(entity.getUrl());
	}


}
