package bitcamp.java87.project01.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import bitcamp.java87.project01.dao.ContentDao;
import bitcamp.java87.project01.domain.Content;
import bitcamp.java87.project01.service.ContentService;

@Service("contentServiceImpl")
public class ContentServiceImpl implements ContentService {

	/// Field
	@Autowired
	@Qualifier("contentDaoImpl")
	private ContentDao contentDao;

	public void setContentDao(ContentDao contentDao) {
		this.contentDao = contentDao;
	}

	/// Constructor
	public ContentServiceImpl() {
		System.out.println(this.getClass());
	}

	/// Method
	public void addContent(Content content) throws Exception {
		contentDao.addContent(content);
		contentDao.addContentTag(content);
	}

	public Content getContent(int contentId) throws Exception {
		Content content = contentDao.getContent(contentId);
		content.setTag(contentDao.getContentTag(title));
		return 
	}

	public void deleteContent(int contentId) throws Exception {
		contentDao.deleteContent(contentId);
	}

	public void updateContent(Content content) throws Exception {
		contentDao.updateContent(content);
		contentDao.deleteContentTag(content.getContentId());
		contentDao.addContentTag(content);
	}

}
