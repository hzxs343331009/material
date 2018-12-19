package material.mapper;

import java.util.List;

import material.pojo.PriceLogPojo;

public interface PriceLogMapper {

	void save(PriceLogPojo priceLogPojo);

	List<PriceLogPojo> findAllByModelId(String modelId);

}
