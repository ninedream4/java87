package bitcamp.java87.project01.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import bitcamp.java87.project01.common.ConvertFile;
import bitcamp.java87.project01.common.Upload;
import bitcamp.java87.project01.dao.ContentDao;
import bitcamp.java87.project01.domain.Content;
import bitcamp.java87.project01.service.ContentService;

@Service("contentServiceImpl")
public class ContentServiceImpl implements ContentService {

	/// Field
	@Autowired
	@Qualifier("contentDaoImpl")
	private ContentDao contentDao;
	
	private Upload upload = new Upload();
	
	public void setContentDao(ContentDao contentDao) {
		this.contentDao = contentDao;
	}

	/// Constructor
	public ContentServiceImpl() {
		System.out.println(this.getClass());
	}

	/// Method
	public void addContent(Content content, MultipartFile file) throws Exception {
		
		upload.uploadFile(file, content);
		
		System.out.println("content : "+content);
		
		contentDao.addContent(content);
		contentDao.addContentTag(content);
		
		new PdfToJpegConverter(content.getFilePath(), content.getFileName()).start();
	}
	
	@Override
	public Content getContent(String title) throws Exception {
		return contentDao.getContent(title);
	}

	public void deleteContent(int contentId) throws Exception {
		contentDao.deleteContent(contentId);
	}

	public void updateContent(Content content) throws Exception {
		contentDao.updateContent(content);
		contentDao.deleteContentTag(content.getContentId());
		contentDao.addContentTag(content);
	}
	
	class PdfToJpegConverter extends Thread {
		String filePath;
		String fileName;
		
		public PdfToJpegConverter(String filePath, String fileName) {
			super();
			this.filePath = filePath;
			this.fileName = fileName;
		}

		@Override
		public void run() {
			try {
				ConvertFile.convertFileToJpg(filePath, fileName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
}
