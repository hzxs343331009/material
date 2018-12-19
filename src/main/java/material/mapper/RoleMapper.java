package material.mapper;

import java.util.List;

import material.pojo.Role;

public interface RoleMapper {

	public List<Role> findAll();

	public void delete(String[] roleIds);

	public void save(Role role);

	public Role findOne(String roleId);

	public void update(Role role);
}
