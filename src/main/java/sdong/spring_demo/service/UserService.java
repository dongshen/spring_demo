package sdong.spring_demo.service;

import java.util.List;

import sdong.spring_demo.bean.User;

public interface UserService {
	boolean insert(User user);

	List<User> selectList();

}