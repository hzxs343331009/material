package material.service;

import java.util.List;

import material.pojo.Company;

public interface CompanyService {

	List<Company> findAll();

	void updateState(int state, String[] companyIds);

	Company findCompanyByCompanyId(String companyId);

	List<Company> findAllGroupByCompanyName();

	void save(Company company);

}
