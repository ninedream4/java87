package bitcamp.java87.project01.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import bitcamp.java87.project01.dao.ContentDao;
import bitcamp.java87.project01.domain.Content;
import bitcamp.java87.project01.domain.Search;
import bitcamp.java87.project01.service.ContentService;
import bitcamp.java87.project01.service.ProductService;

@Service("contentServiceImpl")
public class ContentServiceImpl implements ContentService {

  /// Field
  @Autowired
  @Qualifier("contentDaoImpl")
  private ContentDao contentDao;

  public void setContentDao(ContentDao contentDao) { // xml bean get������
                                                     // ��������占�
    this.contentDao = contentDao;
  }

  /// Constructor
  public ContentServiceImpl() {
    System.out.println(this.getClass());
  }

  /// Method
  public void addContent(Content content) throws Exception {
    System.out.println("contentService==========================addcontent");
    contentDao.addContent(content);
  }

  public Content getContent(String title) throws Exception {
    return contentDao.getContent(title);
  }

  public Content deleteContent(int contentId) throws Exception {
    return contentDao.deleteContent(contentId);
  }

  public void updateContent(Content content) throws Exception {
  // TODO Auto-generated method stub
  contentDao.updateContent(content);
  }

  // public Map<String , Object > getProductList(Search search) throws Exception
  // {
  // List<Product> list= productDao.getProductList(search);
  // int totalCount = productDao.getTotalCount(search);
  //
  // Map<String, Object> map = new HashMap<String, Object>();
  // map.put("list", list );
  // map.put("totalCount", new Integer(totalCount));
  //
  // return map;
  // }
  //
  // @Override
  // public Product getProduct(int prodNo) throws Exception {
  // // TODO Auto-generated method stub
  // return productDao.getProduct(prodNo);
  // }
  //
  

}
