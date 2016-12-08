package bitcamp.java87.project01.service;

import bitcamp.java87.project01.domain.Content;

public interface ContentService {

	public void addContent(Content content) throws Exception;

	public Content getContent(String title) throws Exception;

	public Content deleteContent(int contentId) throws Exception;

	public void updateContent(Content content) throws Exception;
}
