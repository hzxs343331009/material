package material.service;

import java.util.List;

import material.pojo.User;

public interface UserService {
	public List<User> findAll();

	public void changeState(int state, String[] userIds);

	public void delete(String[] userIds);

	public void save(User user);

	public User findOne(String userId);

	public void update(User user);
}
