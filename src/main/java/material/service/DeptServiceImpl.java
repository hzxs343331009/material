package material.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import material.mapper.DeptMapper;
import material.pojo.Dept;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return deptMapper.findAll();
	}
//	@Override
//	public void updateState(int state, String deptId) {
//		// TODO Auto-generated method stub
//		
//		deptMapper.updateState(state,deptId);
//	}
	@Override
	public void updateState(int state, String[] deptIds) {
		// TODO Auto-generated method stub
		deptMapper.updateState(state, deptIds);
	}
	@Override
	public void delete(String[] deptIds) {
		// TODO Auto-generated method stub
		deptMapper.delete(deptIds);
	}
	@Override
	public void save(Dept dept) {
		//获取UUID作为部门id
		dept.setDeptId(UUID.randomUUID().toString());

		deptMapper.save(dept);
	}
	@Override
	public Dept findOneById(String deptId) {
		// TODO Auto-generated method stub
		return deptMapper.findOneById(deptId);
	}
	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		deptMapper.update(dept);
	}
	

}
