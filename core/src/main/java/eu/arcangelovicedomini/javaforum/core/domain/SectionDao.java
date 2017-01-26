package eu.arcangelovicedomini.javaforum.core.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eu.arcangelovicedomini.javaforum.core.vo.SectionVO;

@Repository("sectionDao")
public class SectionDao extends DaoBase<Section, SectionVO, Long> {
	
	@Autowired
	private AreaDao areaDao;
	
	@Override
	protected void toVo(Section entity, SectionVO vo) throws Exception {
		
		vo.setDescription(entity.getDescription());
		vo.setSectionId(entity.getSectionId());
		vo.setTitle(entity.getTitle());
	
	}
	
}
