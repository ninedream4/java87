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

  // ///Method
  public void addContent(Content content) throws Exception {
    System.out.println("/content/addContent : contentDaoImpl " + content);
    sqlSession.insert("ContentMapper.addContent", content);
  }

  public Content getContent(String title) throws Exception {
   return sqlSession.selectOne("ContentMapper.getContent", title);
   }

  public Content deleteContent(int contentId) throws Exception {  
    return sqlSession.selectOne("ContentMapper.deleteContent", contentId);
   }
  
  @Override
  public void updateContent(Content content) throws Exception {
  // TODO Auto-generated method stub
  sqlSession.update("ContentMapper.updateContent", content);
  }
  
  
  // public List<Product> getProductList(Search search) throws Exception {
  // return sqlSession.selectList("ProductMapper.getProductList", search);
  // }
  //
  // public int getTotalCount(Search search) throws Exception {
  // return sqlSession.selectOne("ProductMapper.getTotalCount", search);
  // }
  //


}
