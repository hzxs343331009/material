package material.pojo;

import java.util.Date;

public class ModelPojo extends BaseEntity {

	/*
	 * model_id` bigint(5) NOT NULL AUTO_INCREMENT COMMENT '型号ID', `parent_id`
	 * bigint(5) DEFAULT NULL COMMENT '类型ID', `amount` bigint(20) DEFAULT '999'
	 * COMMENT '库存量', `price_latest` double DEFAULT NULL COMMENT '最新价格',
	 * `price_date` date DEFAULT NULL COMMENT '最近更新价格时间', `model_str` varchar(50)
	 * NOT NULL COMMENT '型号', `state` tinyint(1) DEFAULT '1' COMMENT '是否启用', `unit`
	 * varchar(5) DEFAULT NULL COMMENT '单位',
	 */

	private String modelId;
	private Type parentType;
	private Integer amount;
	private Double price;
	private Date pDate;
	private String modelStr;
	private Integer state;
	private String unit;
	private Company company;
	
	public ModelPojo() {
		super();
	}

	public ModelPojo(String modelId, Type parentType, Integer amount, Double price, Date pDate, String modelStr,
			Integer state, String unit, Company company) {
		super();
		this.modelId = modelId;
		this.parentType = parentType;
		this.amount = amount;
		this.price = price;
		this.pDate = pDate;
		this.modelStr = modelStr;
		this.state = state;
		this.unit = unit;
		this.company = company;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public Type getParentType() {
		return parentType;
	}

	public void setParentType(Type parentType) {
		this.parentType = parentType;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getpDate() {
		return pDate;
	}

	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}

	public String getModelStr() {
		return modelStr;
	}

	public void setModelStr(String modelStr) {
		this.modelStr = modelStr;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Model [modelId=" + modelId + ", parentType=" + parentType + ", amount=" + amount + ", price=" + price
				+ ", pDate=" + pDate + ", modelStr=" + modelStr + ", state=" + state + ", unit=" + unit + ", company=" + company + "]";
	}

}
