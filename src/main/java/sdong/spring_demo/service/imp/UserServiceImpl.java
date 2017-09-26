package sdong.spring_demo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdong.spring_demo.bean.User;
import sdong.spring_demo.mapper.UserMapper;
import sdong.spring_demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;

	@Override
	public boolean insert(User user) {
		return mapper.insert(user) == 1;
	}

	@Override
	public List<User> selectList() {
		return mapper.selectList();
	}
}