package eu.arcangelovicedomini.javaforum.core.domain;

import org.springframework.stereotype.Repository;

import eu.arcangelovicedomini.javaforum.core.vo.ThreadVO;

@Repository("threadDao")
public class ThreadDao extends DaoBase<Thread, ThreadVO, Long> {

	
	@Override
	protected void toVo(Thread entity, ThreadVO vo) throws Exception {
		//FIXME to implement
		//FIXME create a full VO
	}

}
