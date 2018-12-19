package material.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import material.mapper.CompanyMapper;
import material.pojo.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyMapper companyMapper;
	
	@Override
	public List<Company> findAll() {
		return companyMapper.findAll();
	}

	@Override
	public void updateState(int state, String[] companyIds) {
		companyMapper.updataState(state, companyIds);
	}

	@Override
	public Company findCompanyByCompanyId(String companyId) {
		return companyMapper.findCompanyByCompanyId(companyId);
	}

	@Override
	public List<Company> findAllGroupByCompanyName() {
		return companyMapper.findAllGroupByCompanyName();
	}

	@Override
	public void save(Company company) {
		companyMapper.save(company);
	}

}
