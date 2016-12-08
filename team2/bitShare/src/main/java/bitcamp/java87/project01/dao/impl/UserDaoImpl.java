package bitcamp.java87.project01.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import bitcamp.java87.project01.dao.UserDao;
import bitcamp.java87.project01.domain.Search;
import bitcamp.java87.project01.domain.User;


@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao{
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public UserDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method
	public void addUser(User user) throws Exception {
		int x =sqlSession.insert("UserMapper.addUser", user);
		
		
		if(x==1){
			User user1 = new User();
			user1=sqlSession.selectOne("UserMapper.getUser", user.getEmail());		
			
			user.setActive(true);
			user1.setTag(user.getTag());
			sqlSession.insert("UserMapper.addUserTag", user1);
		}
	}
	public void addUserTag(String tag) throws Exception {
		sqlSession.insert("UserMapper.addUserTag", tag);
	}

	public User getUser(String email) throws Exception {
		return sqlSession.selectOne("UserMapper.getUser", email);
	}
	
	public void updateUser(User user) throws Exception {
		sqlSession.update("UserMapper.updateUser", user);
	}

	public List<User> getUserList(Search search) throws Exception {
		return sqlSession.selectList("UserMapper.getUserList", search);
	}

	public int getTotalCount(Search search) throws Exception {
		return sqlSession.selectOne("UserMapper.getTotalCount", search);
	}
}