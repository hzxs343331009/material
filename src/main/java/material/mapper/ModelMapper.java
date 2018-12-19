package material.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import material.pojo.ModelPojo;

public interface ModelMapper {

	List<ModelPojo> findAll();

	List<ModelPojo> findAllByType(String typeId);

	void updateState(@Param("state")int state, @Param("modelIds")String[] modelIds);

	void save(ModelPojo modelPojo);

	ModelPojo findOneByName(ModelPojo modelPojo);

	ModelPojo findOneById(String modelId);

	void update(ModelPojo modelPojo);

	void delete(String[] modelIds);

}
