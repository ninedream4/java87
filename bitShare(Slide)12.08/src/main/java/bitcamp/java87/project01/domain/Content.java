package bitcamp.java87.project01.domain;

import java.util.Date;
import java.util.List;

public class Content {

	private String title;
	private int contentId;
	private String fileDesc;
	private String filePath;
	private String category;
	private Date regDate;
	private List<String> tag;

	public Content() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getFileDesc() {
		return fileDesc;
	}

	public void setFileDesc(String fileDesc) {
		this.fileDesc = fileDesc;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public List<String> getTag() {
		return tag;
	}

	public void setTag(List<String> tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Content [title=" + title + ", contentId=" + contentId + ", fileDesc=" + fileDesc + ", filePath="
				+ filePath + ", category=" + category + ", regDate=" + regDate + ", tag=" + tag + "]";
	}

}
