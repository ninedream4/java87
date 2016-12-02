package bitcamp.java87.project01.domain;

import java.util.Date;

public class Content {

  private String title;
  private int contentId;
  private String fileDesc;
  private String filePath="1";
  private String category;
  private Date regDate;
  private String tag;

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

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  @Override
  public String toString() {
    return "Content [title=" + title + ", contentId=" + contentId + ", fileDesc=" + fileDesc + ", filePath=" + filePath + ", category="
        + category + ", regDate=" +regDate+", tag="+tag+"]";
  }

}
