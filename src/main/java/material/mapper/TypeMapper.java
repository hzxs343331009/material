package material.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import material.pojo.Type;

public interface TypeMapper {

	public List<Type> findAll();

	public void updateState(@Param("state") int state, @Param("typeIds") String[] typeIds);

	public void save(Type type);

	public Type findOneById(String typeId);

	public void update(Type type);

	public void delete(String[] typeIds);

}
