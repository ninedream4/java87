package bitcamp.java87.project01.domain;

public class User {
	
	///Field
  private int userId;
  private String email;
  private String pwd;
	
	////
	public User(){ }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    return "User [userId=" + userId + ", email=" + email + ", pwd=" + pwd + "]";
  }


}