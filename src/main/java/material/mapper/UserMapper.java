package material.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import material.pojo.User;

public interface UserMapper {

	public List<User> findAll();

	public void changeState(@Param("state")int state, @Param("userIds")String[] userIds);

	public void delete(String[] userIds);

	public void save(User user);

	public User findOne(String userId);

	public void update(User user);
}
