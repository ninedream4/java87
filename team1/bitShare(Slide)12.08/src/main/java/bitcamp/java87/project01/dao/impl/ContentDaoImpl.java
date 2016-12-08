package bitcamp.java87.project01.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import bitcamp.java87.project01.dao.ContentDao;
import bitcamp.java87.project01.domain.Content;

@Repository("contentDaoImpl")
public class ContentDaoImpl implements ContentDao {

	/// Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	/// Constructor
	public ContentDaoImpl() {
		System.out.println(this.getClass());
	}

	/// Method
	public void addContent(Content content) throws Exception {
		sqlSession.insert("ContentMapper.addContent", content);
	}
	
	@Override
	public void addContentTag(Content content) throws Exception {
		sqlSession.insert("ContentMapper.addContentTag", content);
	}
	
	public Content getContent(String title) throws Exception {
		return sqlSession.selectOne("ContentMapper.getContent", title);
	}

	public Content deleteContent(int contentId) throws Exception {
		return sqlSession.selectOne("ContentMapper.deleteContent", contentId);
	}

	@Override
	public void updateContent(Content content) throws Exception {
		sqlSession.update("ContentMapper.updateContent", content);
	}

}
