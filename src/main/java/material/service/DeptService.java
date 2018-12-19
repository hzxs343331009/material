package material.service;

import java.util.List;

import material.pojo.Dept;

public interface DeptService {
	public List<Dept> findAll();

//	public void updateState(int state, String deptId);

	public void updateState(int state, String[] deptIds);

	public void delete(String[] deptIds);

	public void save(Dept dept);

	public Dept findOneById(String deptId);

	public void update(Dept dept);
}
