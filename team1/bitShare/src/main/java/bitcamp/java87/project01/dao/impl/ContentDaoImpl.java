package bitcamp.java87.project01.dao.impl;

import java.util.List;

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
  //
  // public Product getProduct(int prodNo) throws Exception {
  // return sqlSession.selectOne("ProductMapper.getProduct", prodNo);
  // }
  //
  // public List<Product> getProductList(Search search) throws Exception {
  // return sqlSession.selectList("ProductMapper.getProductList", search);
  // }
  //
  // public int getTotalCount(Search search) throws Exception {
  // return sqlSession.selectOne("ProductMapper.getTotalCount", search);
  // }
  //
  // @Override
  // public void updateProduct(Product product) throws Exception {
  // // TODO Auto-generated method stub
  // sqlSession.update("ProductMapper.updateProduct", product);
  // }

}
