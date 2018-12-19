package material.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import material.pojo.Dept;

public interface DeptMapper {

	public List<Dept> findAll();
//@Param 娉ㄨВ鍙互鎶婂弬鏁板皝瑁呭埌Map涓� 娉ㄨВ涓殑鍙傛暟 灏眒ap涓殑key
//	public void updateState(@Param("state")int state, @Param("deptId")String deptId);
	
	public void updateState(@Param("state")int state,
			@Param("deptIds")String[] deptIds);
 
	public void delete(String[] deptIds);

	public void save(Dept dept);

	
	public Dept findOneById(String deptId);

	public void update(Dept dept);
	
}
