package material.mapper;

import material.pojo.UserInfo;

public interface UserInfoMapper {

	public void delete(String[] userIds);

	public void save(UserInfo userInfo);

	public void update(UserInfo userInfo);
}
