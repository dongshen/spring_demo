package sdong.spring_demo.mapper;

import java.util.List;

import sdong.spring_demo.bean.User;

public interface UserMapper {
	public int insert(User user);

	public List<User> selectList();

}
