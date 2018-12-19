package material.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import material.mapper.PriceLogMapper;
import material.pojo.ModelPojo;
import material.pojo.PriceLogPojo;

@Service
public class PriceLogServiceImpl implements PriceLogService {

	@Autowired
	private PriceLogMapper priceLogMapper;

	@Override
	public void save(ModelPojo modelPojo) {
		PriceLogPojo priceLogPojo = new PriceLogPojo(modelPojo);
		priceLogMapper.save(priceLogPojo);
	}

	@Override
	public List<PriceLogPojo> findAllByModelId(String modelId) {
		List<PriceLogPojo> priceLogs = priceLogMapper.findAllByModelId(modelId);
		return priceLogs;
	}
	
}
