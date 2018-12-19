package material.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import material.mapper.UserInfoMapper;
import material.mapper.UserMapper;
import material.pojo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired 
	private UserInfoMapper userInfoMapper;
	
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

	@Override
	public void changeState(int state, String[] userIds) {
		// TODO Auto-generated method stub
		userMapper.changeState(state,userIds);
	}

	@Override
	public void delete(String[] userIds) {
		// TODO Auto-generated method stub
		userMapper.delete(userIds);
		
		//鍒犻櫎鐢ㄦ埛鎵╁睍琛ㄤ腑鐨勬暟鎹�
		userInfoMapper.delete(userIds);
	}

	@Override
	public void save(User user) {
		//缁欑敤鎴峰拰鐢ㄦ埛鎵╁睍瀵硅薄 璁剧疆id
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		user.getUserInfo().setUserInfoId(userId);
 		//鎶婄敤鎴蜂俊鎭繚瀛樺埌鐢ㄦ埛琛�
		userMapper.save(user);
 		//鎶婃墿灞曚俊鎭繚瀛樺UserInfo琛�
 		userInfoMapper.save(user.getUserInfo());
	}

	@Override
	public User findOne(String userId) {
		// TODO Auto-generated method stub
		return userMapper.findOne(userId);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
		//淇敼鐢ㄦ埛琛ㄦ暟鎹�
		userMapper.update(user);
		
//		鐢ㄦ埛鎵╁睍琛ㄧ殑鏁版嵁
		user.getUserInfo().setUserInfoId(user.getUserId());
		
		userInfoMapper.update(user.getUserInfo());
	}
	

	
	

}
