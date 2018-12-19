package material.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import material.mapper.TypeMapper;
import material.pojo.Type;

@Service
public class TypeServiceImple implements TypeService {

	@Autowired
	private TypeMapper typeMapper;
	
	@Override
	public List<Type> findAll() {
		return typeMapper.findAll();
	}

	@Override
	public void updateState(int state, String[] typeIds) {
		typeMapper.updateState(state,typeIds);
	}

	@Override
	public void save(Type type) {
		typeMapper.save(type);
	}

	@Override
	public Type findOneById(String typeId) {
		return typeMapper.findOneById(typeId);
	}

	@Override
	public void update(Type type) {
		typeMapper.update(type);
	}

	@Override
	public void delete(String[] typeIds) {
		typeMapper.delete(typeIds);
	}

}
