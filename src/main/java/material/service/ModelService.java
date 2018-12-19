package material.service;

import java.util.List;

import material.pojo.ModelPojo;

public interface ModelService {

	List<ModelPojo> findAll();

	List<ModelPojo> findAllByType(String typeId);

	void updateState(int state, String[] modelIds);

	void save(ModelPojo modelPojo);

	ModelPojo findOneById(String modelId);

	void update(ModelPojo modelPojo);

	void delete(String[] modelIds);

}
