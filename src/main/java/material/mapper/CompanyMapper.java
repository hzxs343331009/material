package material.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import material.pojo.Company;

public interface CompanyMapper {

	List<Company> findAll();

	void updataState(@Param("state")int state, @Param("companyIds")String[] companyIds);

	Company findCompanyByCompanyId(String companyId);

	List<Company> findAllGroupByCompanyName();

	void save(Company company);

}
