package eu.arcangelovicedomini.javaforum.core.domain;

import org.springframework.stereotype.Repository;

import eu.arcangelovicedomini.javaforum.core.vo.ForumVO;

@Repository("forumDao")
public class ForumDao extends DaoBase<Forum, ForumVO, Long> {


}
