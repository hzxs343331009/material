package material.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import material.mapper.ModelMapper;
import material.mapper.PriceLogMapper;
import material.pojo.ModelPojo;
import material.pojo.PriceLogPojo;

@Service
public class ModelServiceImpl implements ModelService {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private PriceLogMapper priceLogMapper;
	
	@Override
	public List<ModelPojo> findAll() {
		return modelMapper.findAll();
	}

	@Override
	public List<ModelPojo> findAllByType(String typeId) {
		return modelMapper.findAllByType(typeId);
	}

	@Override
	public void updateState(int state, String[] modelIds) {
		modelMapper.updateState(state,modelIds);
	}

	@Override
	public void save(ModelPojo modelPojo) {
		modelPojo.setpDate(new Date());
		modelMapper.save(modelPojo);
		ModelPojo model = modelMapper.findOneByName(modelPojo);
		PriceLogPojo priceLogPojo = new PriceLogPojo(modelPojo);
		priceLogPojo.setModel(model);
		priceLogMapper.save(priceLogPojo);
	}

	@Override
	public ModelPojo findOneById(String modelId) {
		return modelMapper.findOneById(modelId);
	}

	@Override
	public void update(ModelPojo modelPojo) {
		modelMapper.update(modelPojo);
	}

	@Override
	public void delete(String[] modelIds) {
		modelMapper.delete(modelIds);
	}

}
