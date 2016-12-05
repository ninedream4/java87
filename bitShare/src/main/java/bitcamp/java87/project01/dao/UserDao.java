package bitcamp.java87.project01.dao;

import java.util.List;

import bitcamp.java87.project01.domain.Search;
import bitcamp.java87.project01.domain.User;

public interface UserDao {

	// INSERT USER
	public void addUser(User user) throws Exception;

	// INSERT TAG
	public void addTag(User user) throws Exception;

	// SELECT ONE
	public User getUser(String email) throws Exception;

	// SELECT LIST
	public List<User> getUserList(Search search) throws Exception;

	// UPDATE
	public void updateUser(User user) throws Exception;

	// TOTAL COUNT
	public int getTotalCount(Search search) throws Exception;

}