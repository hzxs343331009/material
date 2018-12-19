package material.pojo;

public class Company extends BaseEntity {

//	  `company_id` bigint(5) NOT NULL AUTO_INCREMENT COMMENT '公司ID',
//	  `company_name` varchar(50) DEFAULT NULL COMMENT '公司名称',
//	  `simple_name` varchar(20) DEFAULT NULL COMMENT '公司简称',
//	  `state` tinyint(1) DEFAULT '1' COMMENT '是否启用',
//	  `duty_no` varchar(50) DEFAULT NULL COMMENT '公司税号',
//	  `user_company` varchar(50) DEFAULT NULL COMMENT '使用公司/地址'
	
	private String companyId;
	private String companyName;
	private String simpleName;
	private String dutyNo;
	private String userCompany;
	private Integer state;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String companyId, String companyName, String simpleName, String dutyNo, String userCompany,
			Integer state) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.simpleName = simpleName;
		this.dutyNo = dutyNo;
		this.userCompany = userCompany;
		this.state = state;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}

	public String getDutyNo() {
		return dutyNo;
	}

	public void setDutyNo(String dutyNo) {
		this.dutyNo = dutyNo;
	}

	public String getUserCompany() {
		return userCompany;
	}

	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", simpleName=" + simpleName
				+ ", dutyNo=" + dutyNo + ", userCompany=" + userCompany + ", state=" + state + "]";
	}
	
	
}
