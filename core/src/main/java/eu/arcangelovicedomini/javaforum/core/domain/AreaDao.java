package eu.arcangelovicedomini.javaforum.core.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eu.arcangelovicedomini.javaforum.core.vo.AreaFullVO;
import eu.arcangelovicedomini.javaforum.core.vo.AreaVO;

@Repository("areaDao")
public class AreaDao extends DaoBase<Area, AreaVO, Long> {

	@Autowired
	private SectionDao sectionDao;
	
	public void setSectionDao(SectionDao sectionDao) {
		this.sectionDao = sectionDao;
	}
	
	@Override
	protected void toVo(Area entity, AreaVO vo) throws Exception {
		vo.setAreaId(entity.getAreaId());
		vo.setDescription(entity.getDescription());
		vo.setTitle(entity.getTitle());
	}

	public AreaFullVO toFullVO(Area entity) throws Exception {
		AreaFullVO vo = new AreaFullVO();
		toVo(entity, vo);
		vo.setSections(sectionDao.toVoCollection(entity.getSections()));
		return vo;
	}
}
