package bitcamp.java87.project01.dao;

import java.util.List;

import bitcamp.java87.project01.domain.Content;
import bitcamp.java87.project01.domain.Search;

public interface ContentDao {

	public void addContent(Content content) throws Exception;

	public void addContentTag(Content content) throws Exception;

	public Content getContent(String title) throws Exception;

	public List<String> getContentTag(int contentId) throws Exception;

	public List<Content> getContentList(Search search) throws Exception;
	
	public void updateContent(Content content) throws Exception;

	public void deleteContent(int contentId) throws Exception;

	public void deleteContentTag(int contentId) throws Exception;
	
	public int getTotalCount(Search search) throws Exception;

}
