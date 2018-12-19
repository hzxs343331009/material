package material.service;

import java.util.List;

import material.pojo.Type;

public interface TypeService {
	public List<Type> findAll();

	public void updateState(int state, String[] typeIds);

	public void save(Type type);

	public Type findOneById(String typeId);

	public void update(Type type);

	public void delete(String[] typeIds);

}
