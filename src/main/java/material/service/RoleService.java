package material.service;

import java.util.List;

import material.pojo.Role;

public interface RoleService {

	public List<Role> findAll();

	public void delete(String[] roleIds);

	public void save(Role role);

	public Role findOne(String roleId);

	public void update(Role role);
}
