package material.service;

import java.util.List;

import material.pojo.ModelPojo;
import material.pojo.PriceLogPojo;

public interface PriceLogService {

	void save(ModelPojo modelPojo);

	List<PriceLogPojo> findAllByModelId(String modelId);

}
