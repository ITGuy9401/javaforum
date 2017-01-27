package eu.arcangelovicedomini.javaforum.core.domain;

import org.springframework.stereotype.Repository;

import eu.arcangelovicedomini.javaforum.core.vo.I18NLanguageVO;

@Repository("i18nLanguage")
public class I18NLanguageDao extends DaoBase<I18NLanguage, I18NLanguageVO, Long> {

	@Override
	protected void toVo(I18NLanguage entity, I18NLanguageVO vo) throws Exception {
		vo.setLanguageCode(entity.getLanguageCode());
		vo.setLanguageId(entity.getLanguageId());
	}

}
