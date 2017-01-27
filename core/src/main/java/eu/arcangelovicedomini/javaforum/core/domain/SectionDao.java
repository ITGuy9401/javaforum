package eu.arcangelovicedomini.javaforum.core.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eu.arcangelovicedomini.javaforum.core.vo.SectionAreaVO;
import eu.arcangelovicedomini.javaforum.core.vo.SectionFullVO;
import eu.arcangelovicedomini.javaforum.core.vo.SectionVO;

@Repository("sectionDao")
public class SectionDao extends DaoBase<Section, SectionVO, Long> {

	@Autowired
	private AreaDao areaDao;

	@Autowired
	private ThreadDao threadDao;
	
	@Override
	protected void toVo(Section entity, SectionVO vo) throws Exception {

		vo.setDescription(entity.getDescription());
		vo.setSectionId(entity.getSectionId());
		vo.setTitle(entity.getTitle());

	}

	public SectionAreaVO toSectionAreaVO(Section entity) throws Exception {
		SectionAreaVO vo = new SectionAreaVO();
		toSectionAreaVO(entity, vo);
		return vo;
	}

	protected void toSectionAreaVO(Section entity, SectionAreaVO vo) throws Exception {
		toVo(entity, vo);
		vo.setArea(areaDao.toVo(entity.getArea()));
	}

	public SectionFullVO toSectionFullVO(Section entity) throws Exception {
		SectionFullVO vo = new SectionFullVO();
		toSectionFullVO(entity, vo);
		return vo;
	}

	protected void toSectionFullVO(Section entity, SectionFullVO vo) throws Exception {
		toSectionAreaVO(entity, vo);
		vo.setFatherSection(toVo(entity.getFatherSection()));
		vo.setChildSections(toVoCollection(entity.getChildSections()));
		vo.setThreads(threadDao.toVoCollection(entity.getThreads()));
	}
}
