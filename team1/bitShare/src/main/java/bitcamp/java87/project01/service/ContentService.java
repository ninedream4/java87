package bitcamp.java87.project01.service;

import java.util.Map;

import bitcamp.java87.project01.domain.Content;
import bitcamp.java87.project01.domain.Search;

public interface ContentService {

//  public Map<String, Object> getProductList(Search search) throws Exception;
//
  public void addContent(Content content) throws Exception;
//
  public Content getContent(String title) throws Exception;
  
  public Content deleteContent(int contentId)throws Exception;
//
  public void updateContent(Content content) throws Exception;
}
